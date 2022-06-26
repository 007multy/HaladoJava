package com.uni.uni.persist;

import com.uni.uni.model.Exam;
import org.springframework.stereotype.Component;


import java.util.*;

@Component
public class ExamDAOImplement implements ExamDAO{

    private Map<Integer, Exam> ExamMap;

    public ExamDAOImplement(){
    	ExamMap = new HashMap<>();
    	ExamMap.put(1, new Exam(1, "HaladoJava", "2022.06.29"));
    	ExamMap.put(2, new Exam(2, "Bevezetés a CAD-be", "2022.07.02"));
    	ExamMap.put(3, new Exam(3, "Informatikai rendszerek építése", "2022.07.10"));
    }

    @Override
    public Exam getExam(int id) {
        return ExamMap.get(id);
    }

    @Override
    public List<Exam> getAllExams() {
        return new ArrayList<Exam>(ExamMap.values());
    }

    @Override
    public void createExam(Exam exam) {
    	ExamMap.put(exam.getId(), exam);
    }

    @Override
    public void updateExam(Exam exam) {
    	ExamMap.replace(exam.getId(), exam);
    }

    @Override
    public void deleteExam(int id){
    	ExamMap.remove(id);
    }

}
