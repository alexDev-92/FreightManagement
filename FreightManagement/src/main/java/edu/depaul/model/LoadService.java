package edu.depaul.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadService {
	
	@Autowired
	LoadRepository loadRepo;
	
	public List<Load>getAllLoads() {
		List <Load>Loads = new ArrayList<Load>();
		loadRepo.findAll().forEach(Loads::add);
		
		
		return Loads;
	}
	
	public Load getLoad(Long id) {
		return loadRepo.findById(id).get();
		
		
	}
	
	public void deleteLoad(Long id) {
		loadRepo.deleteById(id);
	}
		
	public Load addLoad(Load load) {
		return loadRepo.save(load);
	}

}
