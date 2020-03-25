package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepository;
import com.challenge.service.interfaces.AccelerationServiceInterface;

@Service
public class AccelerationService implements AccelerationServiceInterface {

	@Autowired
	private AccelerationRepository accelerationRepository;
	
	@Override
	public Acceleration save(Acceleration acceleration) {
		// TODO Auto-generated method stub
		return accelerationRepository.save(acceleration);
	}

	@Override
	public Optional<Acceleration> findById(Long id) {
		// TODO Auto-generated method stub
		return accelerationRepository.findById(id);
	}

	@Override
	public List<Acceleration> findByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return accelerationRepository.findByCompanyId(companyId);
	}

}
