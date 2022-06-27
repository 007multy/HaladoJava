package com.timetable.timetable.service;

import com.timetable.timetable.model.Lecturehall;
import java.util.List;


public interface LecturehallService {
	List<Lecturehall> listAllLecturehalls();
	void getLecturehall(int id);
	void createLecturehall(Lecturehall Lecturehall);
	void editLecturehall(Lecturehall Lecturehall);
	void deleteLecturehall(int id);
	
	
}
