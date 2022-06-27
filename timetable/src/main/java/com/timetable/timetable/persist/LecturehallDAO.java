package com.timetable.timetable.persist;

import com.timetable.timetable.model.Lecturehall;
import java.util.List;


public interface LecturehallDAO {
	
	    Lecturehall getLecturehall(int id);

	    List<Lecturehall> getAllLecturehalls();

	    void createLecturehall(Lecturehall Lecturehall);

	    void updateLecturehall(Lecturehall Lecturehall);

	    void deleteLecturehall(int id);

	
}