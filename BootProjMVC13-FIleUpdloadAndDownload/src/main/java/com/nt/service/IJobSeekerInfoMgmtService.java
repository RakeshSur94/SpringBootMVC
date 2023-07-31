package com.nt.service;

import java.util.List;

import com.nt.entity.JobSeekerInfo;

public interface IJobSeekerInfoMgmtService {
	public String registerJobSeeker(JobSeekerInfo jsInfo);
	public List<JobSeekerInfo> getAllJobSeeker();
	public String fetchReumePathById(int id);
	public String fetchPhotoPathById(int id);
	

}
