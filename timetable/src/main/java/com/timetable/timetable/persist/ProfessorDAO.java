package com.timetable.timetable.persist;

import java.util.List;

import com.timetable.timetable.model.Professor;

public interface ProfessorDAO {
	Professor getProfessor(int id);

    List<Professor> getAllProfessors();

    void createProfessor(Professor Professor);

    void updateProfessor(Professor Professor);

    void deleteProfessor(int id);

}
