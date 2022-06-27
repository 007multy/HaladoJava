package com.timetable.timetable.service;

import java.util.List;

import com.timetable.timetable.model.Professor;

public interface ProfessorService {
	List<Professor> listAllProfessors();
	void getProfessor(int id);

    void createProfessor(Professor Professor);

    void editProfessor(Professor Professor);

    void deleteProfessor(int id);

}
