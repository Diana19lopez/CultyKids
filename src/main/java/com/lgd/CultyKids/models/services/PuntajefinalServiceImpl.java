package com.lgd.CultyKids.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.lgd.CultyKids.models.entities.PuntajeFinal;
import com.lgd.CultyKids.models.repository.PuntajefinalRepository;

public class PuntajefinalServiceImpl implements PuntajefinalService {
	@Autowired
	public PuntajefinalRepository repository;

	@Override
	public List<PuntajeFinal> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PuntajeFinal save(PuntajeFinal entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PuntajeFinal> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
