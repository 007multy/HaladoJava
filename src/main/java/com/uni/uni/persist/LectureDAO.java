package com.uni.uni.persist;

import com.uni.uni.model.Lecture;
import java.util.List;


public interface LectureDAO {
	
	    Lecture getLecture(int id);

	    List<Lecture> getAllLectures();

	    void createLecture(Lecture Lecture);

	    void updateLecture(Lecture Lecture);

	    void deleteLecture(int id);

	
}