package com.example.taskproject.service;

import java.util.List;
import java.util.Map;

import com.example.taskproject.dto.DistributorDto;
import com.example.taskproject.entity.Distributor;



public interface DistributorService {

	public Map<String, Object> saveDistributor(Distributor distributor);

	public List<Distributor> getAllDistributors();

	public Distributor saveDistributor(DistributorDto distributorDto);
}
