package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.JobSeekerInfo;

public interface IJobSeekerInfoRepository extends JpaRepository<JobSeekerInfo, Integer> {
	
	@Query("SELECT jsResumePath FROM JobSeekerInfo WHERE jsId=:id")
	public String getReumePathById(int id);
	@Query("SELECT jsPhotoPath FROM JobSeekerInfo WHERE jsId=:id")
	public String getPhotoPathById(int id);

}
