package com.uni.uni.service;


import org.springframework.stereotype.Service;

import com.uni.uni.model.Lecture;
import com.uni.uni.persist.LectureDAO;

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

	

}
