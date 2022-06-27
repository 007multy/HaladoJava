package com.timetable.timetable.service;


import org.springframework.stereotype.Service;

import com.timetable.timetable.model.Lecturehall;
import com.timetable.timetable.persist.LecturehallDAO;

import java.util.List;

@Service
public class LecturehallServiceImplement implements LecturehallService{

    private LecturehallDAO LecturehallDAO;

    public LecturehallServiceImplement(LecturehallDAO LecturehallDAO){
        this.LecturehallDAO = LecturehallDAO;
    }

    @Override
    public List<Lecturehall> listAllLecturehalls() {
        return LecturehallDAO.getAllLecturehalls();
    }
    
    @Override
	public void getLecturehall(int id) {
		LecturehallDAO.getLecturehall(id);
		
	}

    
    @Override
    public void createLecturehall(Lecturehall Lecturehall) {
    	LecturehallDAO.createLecturehall(Lecturehall);
    }

    
    @Override
	public void editLecturehall(Lecturehall Lecturehall) {
    	LecturehallDAO.updateLecturehall(Lecturehall);
		
	}

	@Override
	public void deleteLecturehall(int id) {
		LecturehallDAO.deleteLecturehall(id);
		
	}

	

}
