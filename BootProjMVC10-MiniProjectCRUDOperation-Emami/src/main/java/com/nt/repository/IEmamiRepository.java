package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.model.Emami;

public interface IEmamiRepository extends JpaRepository<Emami, Integer> {
	

}
