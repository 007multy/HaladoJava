package com.uni.uni.service;

import com.uni.uni.model.Assignment;
import java.util.List;


public interface AssignmentService {
	List<Assignment> listAllAssignments();
	void getAssignment(int id);
	void createAssignment(Assignment Assignment);
	void editAssignment(Assignment Assignment);
	void deleteAssignment(int id);
	
	
}
