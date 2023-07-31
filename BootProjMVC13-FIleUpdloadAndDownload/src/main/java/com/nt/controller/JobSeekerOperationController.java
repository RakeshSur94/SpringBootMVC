package com.nt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.JobSeekerData;
import com.nt.entity.JobSeekerInfo;
import com.nt.service.IJobSeekerInfoMgmtService;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class JobSeekerOperationController {
	@Autowired
	private IJobSeekerInfoMgmtService jsService;

	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

	@GetMapping("/js_register")
	public String showRegistetPage(@ModelAttribute("js") JobSeekerData jsData) {
		return "jobseeker_register";
	}

	@Autowired
	private Environment env;

	@PostMapping("/js_register")
	public String registerJSByUploadingFiles(@ModelAttribute("js") JobSeekerData jsData, Map<String, Object> map) {
		// get the file location form properties file
		String fileLocation = env.getRequiredProperty("upload.store");
		// if that not availabe then create it
		File file = new File(fileLocation);
		if (!file.exists())
			file.mkdir();
		// get inputStream repressing the upload file
		MultipartFile resumeFile = jsData.getResume();
		MultipartFile photoFile = jsData.getPhoto();
		try (InputStream is1 = resumeFile.getInputStream(); InputStream is2 = photoFile.getInputStream();) {
			// get the name of upload file
			String resumeFileName = resumeFile.getOriginalFilename();
			String photoFilename = photoFile.getOriginalFilename();
			// Create outputStream representing empty destination file content
			try (OutputStream osResume = new FileOutputStream(file.getAbsolutePath() + "\\" + resumeFileName);
					OutputStream osPhoto = new FileOutputStream(file.getAbsolutePath() + "\\" + photoFilename);) {
				// perform file copy operation
				IOUtils.copy(is1, osResume);
				IOUtils.copy(is2, osPhoto);
				// create Entity class object from Model class obj
				JobSeekerInfo jsinfo = new JobSeekerInfo();
				jsinfo.setJsName(jsData.getJsName());
				jsinfo.setJsAddrs(jsData.getJsAddrs());
				jsinfo.setJsResumePath(file.getAbsolutePath() + "/" + resumeFileName);
				jsinfo.setJsPhotoPath(file.getAbsolutePath() + "/" + photoFilename);
				// use service
				String result = jsService.registerJobSeeker(jsinfo);
				// keep the upload file names and location in model class object
				map.put("file1", resumeFileName);
				map.put("file2", photoFilename);
				map.put("resultmsg", result);

			} // second try

		} // first Try
		catch (Exception e) {
			e.printStackTrace();
		}

		return "show_result";
	}

	@GetMapping("/get_jobSeeker")
	public String getAllJobSeeker(Map<String, Object> map) {
		// use service
		List<JobSeekerInfo> list = jsService.getAllJobSeeker();
		// keep the list in model attribute
		map.put("list_of_allJobSeeker", list);
		return "AllJobSeeker";
	}

	@Autowired
	private ServletContext sc;

	@GetMapping("/download")
	public String fileDownload(@RequestParam("jsId") Integer id, @RequestParam("type") String type,
			HttpServletResponse res) {

		// get path of the file to download
		String filePath = null;
		if (type.equalsIgnoreCase("resume"))
			filePath = jsService.fetchReumePathById(id);
		else
			filePath = jsService.fetchPhotoPathById(id);
		System.out.println(filePath);

		// create File object representing the file to be download
		File file = new File(filePath);
		// get the file length and make it as the response content length
		res.setContentLengthLong(file.length());
		//get MIME of the file and make it response content type
		String mimeType=sc.getMimeType(filePath);
		mimeType=mimeType==null?"application/octec-stream":mimeType;
		res.setContentType(mimeType);
		//create InputStream pointing to the file
		try(InputStream is= new FileInputStream(file);
				//create OutputStream pointing to the response object
				OutputStream os= res.getOutputStream();
				){
			//instruct the browser give the  file as downloadble file
			res.setHeader("Content-Disposition", "attachment;fileName="+file.getName());
			//Write the file content to response object
			IOUtils.copy(is, os);
			
			
			
		}//try
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;//make the handler method to send response directly to browser

	}

}