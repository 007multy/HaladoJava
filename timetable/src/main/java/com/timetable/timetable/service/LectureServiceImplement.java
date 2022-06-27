package com.timetable.timetable.service;


import org.springframework.stereotype.Service;

import com.timetable.timetable.model.Lecture;
import com.timetable.timetable.persist.LectureDAO;

import java.util.List;

@Service
public class LectureServiceImplement implements LectureService{

    private LectureDAO LectureDAO;

    public LectureServiceImplement(LectureDAO LectureDAO){
        this.LectureDAO = LectureDAO;
    }

    @Override
    public List<Lecture> listAllLectures() {
        return LectureDAO.getAllLectures();
    }
    
    @Override
	public void getLecture(int id) {
		LectureDAO.getLecture(id);
		
	}

    
    @Override
    public void createLecture(Lecture Lecture) {
    	LectureDAO.createLecture(Lecture);
    }

    
    @Override
	public void editLecture(Lecture Lecture) {
    	LectureDAO.updateLecture(Lecture);
		
	}

	@Override
	public void deleteLecture(int id) {
		LectureDAO.deleteLecture(id);
		
	}

	@Override
	public void getLecturebyObjectID(int objectID) {
		LectureDAO.getLecturebyObjectID(objectID);
		
	}

	@Override
	public void deleteLectureProfessor(int professorID) {
		LectureDAO.deleteLectureProfessor(professorID);
		
	}

	

}
