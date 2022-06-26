package com.uni.uni.persist;

import com.uni.uni.model.Assignment;
import java.util.List;


public interface AssignmentDAO {
	
	    Assignment getAssignment(int id);

	    List<Assignment> getAllAssignments();

	    void createAssignment(Assignment Assignment);

	    void updateAssignment(Assignment Assignment);

	    void deleteAssignment(int id);

	
}