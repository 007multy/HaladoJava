package com.uni.uni.service;

import com.uni.uni.model.Practice;
import java.util.List;


public interface PracticeService {
	List<Practice> listAllPractices();
	void getPractice(int id);
	void createPractice(Practice Practice);
	void editPractice(Practice Practice);
	void deletePractice(int id);
	
	
}
