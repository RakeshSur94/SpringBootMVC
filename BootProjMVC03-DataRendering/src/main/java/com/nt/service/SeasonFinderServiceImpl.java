package com.nt.service;

import java.time.LocalDate;
import org.springframework.stereotype.Service;

@Service("seasonService")
public class SeasonFinderServiceImpl implements ISeasonFinderService {

	@Override
	public String findSeason() {
		//get system Date
		LocalDate ld=LocalDate.now();
		int month=ld.getMonthValue();
		//find season
		if(month>=7&&month<=9)
			return "Rainy Season";
		else if(month>=9&&month<=2)
			return "Winter Season";
		else
			return "Summer Season";
		
	}

}
