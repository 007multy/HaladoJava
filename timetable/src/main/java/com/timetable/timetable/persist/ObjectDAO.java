package com.timetable.timetable.persist;

import com.timetable.timetable.model.Object;
import java.util.List;


public interface ObjectDAO {
	
	    Object getObject(int id);

	    List<Object> getAllObjects();

	    void createObject(Object Object);

	    void updateObject(Object Object);

	    void deleteObject(int id);

	
}