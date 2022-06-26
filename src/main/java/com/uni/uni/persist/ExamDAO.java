package com.uni.uni.persist;

import com.uni.uni.model.Exam;
import java.util.List;


public interface ExamDAO {
	
	    Exam getExam(int id);

	    List<Exam> getAllExams();

	    void createExam(Exam exam);

	    void updateExam(Exam exam);

	    void deleteExam(int id);

	
}