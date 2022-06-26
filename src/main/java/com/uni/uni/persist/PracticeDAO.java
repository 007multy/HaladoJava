package com.uni.uni.persist;

import com.uni.uni.model.Practice;
import java.util.List;


public interface PracticeDAO {
	
	    Practice getPractice(int id);

	    List<Practice> getAllPractices();

	    void createPractice(Practice Practice);

	    void updatePractice(Practice Practice);

	    void deletePractice(int id);

	
}