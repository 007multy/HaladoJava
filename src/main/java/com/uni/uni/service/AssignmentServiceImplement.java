package com.uni.uni.service;


import org.springframework.stereotype.Service;

import com.uni.uni.model.Assignment;
import com.uni.uni.persist.AssignmentDAO;

import java.util.List;

@Service
public class AssignmentServiceImplement implements AssignmentService{

    private AssignmentDAO AssignmentDAO;

    public AssignmentServiceImplement(AssignmentDAO AssignmentDAO){
        this.AssignmentDAO = AssignmentDAO;
    }

    @Override
    public List<Assignment> listAllAssignments() {
        return AssignmentDAO.getAllAssignments();
    }
    
    @Override
	public void getAssignment(int id) {
		AssignmentDAO.getAssignment(id);
		
	}

    
    @Override
    public void createAssignment(Assignment Assignment) {
    	AssignmentDAO.createAssignment(Assignment);
    }

    
    @Override
	public void editAssignment(Assignment Assignment) {
    	AssignmentDAO.updateAssignment(Assignment);
		
	}

	@Override
	public void deleteAssignment(int id) {
		AssignmentDAO.deleteAssignment(id);
		
	}

	

}
