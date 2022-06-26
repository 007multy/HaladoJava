package com.uni.uni.service;

import com.uni.uni.model.Exam;
import java.util.List;


public interface ExamService {
	List<Exam> listAllExams();
	void getExam(int id);
	void createExam(Exam exam);
	void editExam(Exam exam);
	void deleteExam(int id);
	
	
}
