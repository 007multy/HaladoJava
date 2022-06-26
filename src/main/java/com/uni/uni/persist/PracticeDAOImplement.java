package com.uni.uni.persist;

import com.uni.uni.model.Practice;
import org.springframework.stereotype.Component;


import java.util.*;

@Component
public class PracticeDAOImplement implements PracticeDAO{

    private Map<Integer, Practice> PracticeMap;

    public PracticeDAOImplement(){
    	PracticeMap = new HashMap<>();
    	PracticeMap.put(1, new Practice(1, "HaladoJava", "2022.06.29"));
    	PracticeMap.put(2, new Practice(2, "Bevezetés a CAD-be", "2022.07.02"));
    	PracticeMap.put(3, new Practice(3, "Informatikai rendszerek építése", "2022.07.10"));
    }

    @Override
    public Practice getPractice(int id) {
        return PracticeMap.get(id);
    }

    @Override
    public List<Practice> getAllPractices() {
        return new ArrayList<Practice>(PracticeMap.values());
    }

    @Override
    public void createPractice(Practice Practice) {
    	PracticeMap.put(Practice.getId(), Practice);
    }

    @Override
    public void updatePractice(Practice Practice) {
    	PracticeMap.replace(Practice.getId(), Practice);
    }

    @Override
    public void deletePractice(int id){
    	PracticeMap.remove(id);
    }

}
