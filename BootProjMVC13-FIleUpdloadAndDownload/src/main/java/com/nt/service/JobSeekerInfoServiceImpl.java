package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekerInfo;
import com.nt.repository.IJobSeekerInfoRepository;

@Service("jsService")
public class JobSeekerInfoServiceImpl implements IJobSeekerInfoMgmtService {
	
	@Autowired
	private IJobSeekerInfoRepository jsRepo;

	@Override
	public String registerJobSeeker(JobSeekerInfo jsInfo) {
		
		return "saved with id "+jsRepo.save(jsInfo).getJsId();
	}
	@Override
	public List<JobSeekerInfo> getAllJobSeeker() {
		// TODO Auto-generated method stub
		return jsRepo.findAll();
	}
	@Override
	public String fetchPhotoPathById(int id) {
		// TODO Auto-generated method stub
		return jsRepo.getPhotoPathById(id);
	}
	@Override
	public String fetchReumePathById(int id) {
		// TODO Auto-generated method stub
		return jsRepo.getReumePathById(id);
	}

}
