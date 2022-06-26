package com.uni.uni.service;

import com.uni.uni.model.Lecture;
import java.util.List;


public interface LectureService {
	List<Lecture> listAllLectures();
	void getLecture(int id);
	void createLecture(Lecture Lecture);
	void editLecture(Lecture Lecture);
	void deleteLecture(int id);
	
	
}
