package com.timetable.timetable.service;

import java.util.List;

import com.timetable.timetable.model.Object;


public interface ObjectService {
	List<Object> listAllObjects();
	void getObject(int id);

    void createObject(Object Object);

    void editObject(Object Object);

    void deleteObject(int id);

}
