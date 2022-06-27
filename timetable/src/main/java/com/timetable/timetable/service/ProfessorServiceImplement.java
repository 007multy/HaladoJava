package com.timetable.timetable.service;


import org.springframework.stereotype.Service;

import com.timetable.timetable.model.Professor;
import com.timetable.timetable.persist.ProfessorDAO;

import java.util.List;

@Service
public class ProfessorServiceImplement implements ProfessorService{

    private ProfessorDAO ProfessorDAO;

    public ProfessorServiceImplement(ProfessorDAO ProfessorDAO){
        this.ProfessorDAO = ProfessorDAO;
    }

    @Override
    public List<Professor> listAllProfessors() {
        return ProfessorDAO.getAllProfessors();
    }
    
    @Override
	public void getProfessor(int id) {
		ProfessorDAO.getProfessor(id);
		
	}

 
    @Override
    public void createProfessor(Professor Professor) {
    	ProfessorDAO.createProfessor(Professor);
    }

    
    @Override
	public void editProfessor(Professor Professor) {
    	ProfessorDAO.updateProfessor(Professor);
		
	}

	@Override
	public void deleteProfessor(int id) {
		ProfessorDAO.deleteProfessor(id);
		
	}

}