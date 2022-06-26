package com.uni.uni.persist;

import com.uni.uni.model.Assignment;
import org.springframework.stereotype.Component;


import java.util.*;

@Component
public class AssignmentDAOImplement implements AssignmentDAO{

    private Map<Integer, Assignment> AssignmentMap;

    public AssignmentDAOImplement(){
    	AssignmentMap = new HashMap<>();
    	AssignmentMap.put(1, new Assignment(1, "HaladoJava", "2022.06.27"));
    	AssignmentMap.put(2, new Assignment(2, "WEB technológiák 2", "2022.06.29"));
    	AssignmentMap.put(3, new Assignment(3, "Informatikai rendszerek építése", "2022.06.29"));
    }

    @Override
    public Assignment getAssignment(int id) {
        return AssignmentMap.get(id);
    }

    @Override
    public List<Assignment> getAllAssignments() {
        return new ArrayList<Assignment>(AssignmentMap.values());
    }

    @Override
    public void createAssignment(Assignment Assignment) {
    	AssignmentMap.put(Assignment.getId(), Assignment);
    }

    @Override
    public void updateAssignment(Assignment Assignment) {
    	AssignmentMap.replace(Assignment.getId(), Assignment);
    }

    @Override
    public void deleteAssignment(int id){
    	AssignmentMap.remove(id);
    }

}
