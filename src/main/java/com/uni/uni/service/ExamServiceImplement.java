package com.uni.uni.service;


import org.springframework.stereotype.Service;

import com.uni.uni.model.Exam;
import com.uni.uni.persist.ExamDAO;

import java.util.List;

@Service
public class ExamServiceImplement implements ExamService{

    private ExamDAO ExamDAO;

    public ExamServiceImplement(ExamDAO ExamDAO){
        this.ExamDAO = ExamDAO;
    }

    @Override
    public List<Exam> listAllExams() {
        return ExamDAO.getAllExams();
    }
    
    @Override
	public void getExam(int id) {
		ExamDAO.getExam(id);
		
	}

    
    @Override
    public void createExam(Exam exam) {
    	ExamDAO.createExam(exam);
    }

    
    @Override
	public void editExam(Exam exam) {
    	ExamDAO.updateExam(exam);
		
	}

	@Override
	public void deleteExam(int id) {
		ExamDAO.deleteExam(id);
		
	}

	

}
