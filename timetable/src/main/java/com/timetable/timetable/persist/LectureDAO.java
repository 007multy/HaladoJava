package com.timetable.timetable.persist;

import com.timetable.timetable.model.Lecture;
import java.util.List;


public interface LectureDAO {
	
	    Lecture getLecture(int id);

	    List<Lecture> getAllLectures();

	    void createLecture(Lecture Lecture);

	    void updateLecture(Lecture Lecture);

	    void deleteLecture(int id);

		Lecture getLecturebyObjectID(int objectID);

		void deleteLectureProfessor(int professorID);

	
}