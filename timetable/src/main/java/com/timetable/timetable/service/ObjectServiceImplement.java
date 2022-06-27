package com.timetable.timetable.service;


import org.springframework.stereotype.Service;

import com.timetable.timetable.model.Object;
import com.timetable.timetable.persist.ObjectDAO;

import java.util.List;

@Service
public class ObjectServiceImplement implements ObjectService{

    private ObjectDAO ObjectDAO;

    public ObjectServiceImplement(ObjectDAO ObjectDAO){
        this.ObjectDAO = ObjectDAO;
    }

    @Override
    public List<Object> listAllObjects() {
        return ObjectDAO.getAllObjects();
    }
    
    @Override
	public void getObject(int id) {
		ObjectDAO.getObject(id);
		
	}

 
    @Override
    public void createObject(Object Object) {
    	ObjectDAO.createObject(Object);
    }

    
    @Override
	public void editObject(Object Object) {
    	ObjectDAO.updateObject(Object);
		
	}

	@Override
	public void deleteObject(int id) {
		ObjectDAO.deleteObject(id);
		
	}

}