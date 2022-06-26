package com.uni.uni.persist;

import com.uni.uni.model.Lecture;
import org.springframework.stereotype.Component;


import java.util.*;

@Component
public class LectureDAOImplement implements LectureDAO{

    private Map<Integer, Lecture> LectureMap;

    public LectureDAOImplement(){
    	LectureMap = new HashMap<>();
    	LectureMap.put(1, new Lecture(1, "Erőforrás tervezés", "2022.06.27"));
    	LectureMap.put(2, new Lecture(2, "WEB technológiák 2", "2022.06.28"));
    	LectureMap.put(3, new Lecture(3, "Haladó Java", "2022.06.29"));
    }

    @Override
    public Lecture getLecture(int id) {
        return LectureMap.get(id);
    }

    @Override
    public List<Lecture> getAllLectures() {
        return new ArrayList<Lecture>(LectureMap.values());
    }

    @Override
    public void createLecture(Lecture Lecture) {
    	LectureMap.put(Lecture.getId(), Lecture);
    }

    @Override
    public void updateLecture(Lecture Lecture) {
    	LectureMap.replace(Lecture.getId(), Lecture);
    }

    @Override
    public void deleteLecture(int id){
    	LectureMap.remove(id);
    }

}
