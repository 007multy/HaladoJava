package com.uni.uni.service;


import org.springframework.stereotype.Service;

import com.uni.uni.model.Practice;
import com.uni.uni.persist.PracticeDAO;

import java.util.List;

@Service
public class PracticeServiceImplement implements PracticeService{

    private PracticeDAO PracticeDAO;

    public PracticeServiceImplement(PracticeDAO PracticeDAO){
        this.PracticeDAO = PracticeDAO;
    }

    @Override
    public List<Practice> listAllPractices() {
        return PracticeDAO.getAllPractices();
    }
    
    @Override
	public void getPractice(int id) {
		PracticeDAO.getPractice(id);
		
	}

    
    @Override
    public void createPractice(Practice Practice) {
    	PracticeDAO.createPractice(Practice);
    }

    
    @Override
	public void editPractice(Practice Practice) {
    	PracticeDAO.updatePractice(Practice);
		
	}

	@Override
	public void deletePractice(int id) {
		PracticeDAO.deletePractice(id);
		
	}

	

}
