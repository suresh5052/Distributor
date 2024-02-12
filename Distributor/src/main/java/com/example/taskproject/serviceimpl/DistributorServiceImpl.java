package com.example.taskproject.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskproject.dto.DistributorDto;
import com.example.taskproject.entity.Distributor;
import com.example.taskproject.repository.DistributorRepository;
import com.example.taskproject.service.DistributorService;


@Service
public class DistributorServiceImpl implements DistributorService{


	@Autowired
	DistributorRepository distributorRepository;

	@Override
	public Map<String, Object> saveDistributor(Distributor distributor) {
		Distributor existingdistributor = distributorRepository.save(distributor);
		Map<String, Object> map = new HashMap<>();
		if (existingdistributor != null) {
			map.put("msg", "Distributor added");
			map.put("Distrubutor", existingdistributor.getDistributorId());
		}
		return map;
	}


	@Override
	public List<Distributor> getAllDistributors() {

		return distributorRepository.findAll();
	}


	@Override
	public Distributor saveDistributor(DistributorDto distributorDto) {
		Distributor distributor = new Distributor();
		distributor.setDistributorName(distributorDto.getDistributorName());
		distributor.setDOB(distributorDto.getDOB());
		distributor.setEmail(distributorDto.getEmail());
		distributor.setGender(distributorDto.getGender());
		distributor.setPhoneNumber(distributorDto.getPhoneNumber());
		
		return distributorRepository.save(distributor);
	}


	
}
