package com.nt.jpatest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;

import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.nt.model.Emami;
import com.nt.repository.IEmamiRepository;

@DataJpaTest
public class EmployeeRepositroyTest {
	
	@Autowired
	private IEmamiRepository empRepo;
	
	
	@Test
	public void saveEmployeeTest() {
	Emami emami= new Emami();
	emami.setName("Hari");
	emami.setDesg("shop");
	emami.setSal(2000.0);
	Emami newEmami= empRepo.save(emami);
	assertNotNull(newEmami);

	}

}
