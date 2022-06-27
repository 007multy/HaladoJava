package com.timetable.timetable.controller;

import com.timetable.timetable.model.Lecture;
import com.timetable.timetable.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@Controller
public class LectureController {

    private LectureService LectureService;

    @Autowired
    public LectureController(LectureService LectureService){
        this.LectureService = LectureService;
    }

    @RequestMapping("allLectures")
    @ResponseBody
    public List<Lecture> getLectureList(){
        return LectureService.listAllLectures();
    }
    
    @RequestMapping("getLecture")
    @ResponseBody
    public String getLecture(@RequestParam("id")int id) {
        LectureService.getLecture(id);
        return "OK";
    }
    
    @RequestMapping("getLecturebyObjectID")
    @ResponseBody
    public String getLecturebyObjectID(@RequestParam("objectID")int objectID) {
        LectureService.getLecturebyObjectID(objectID);
		return "OK";
    }

    @RequestMapping("createLecture")
    @ResponseBody
    public String createLecture(@RequestParam("id") int id,
        @RequestParam("objectID") int objectID,
        @RequestParam("professorID") int professorID,
        @RequestParam("lecturehallID") int lecturehallID,
        @RequestParam("date") String date){
    	LectureService.createLecture(new Lecture(id,objectID,professorID,lecturehallID,date));
    	return "OK";
    }
    
    
    @RequestMapping("editLecture")
    @ResponseBody
    public String editLecture(@RequestParam("id") int id,
    		@RequestParam("objectID") int objectID,
            @RequestParam("professorID") int professorID,
            @RequestParam("lecturehallID") int lecturehallID,
            @RequestParam("date") String date){
        	LectureService.editLecture(new Lecture(id,objectID,professorID,lecturehallID,date));
        	return "OK";
        }
    
    
    @RequestMapping("deleteLecture")
    @ResponseBody
    public String deleteLecture(@RequestParam("id")int id) {
        LectureService.deleteLecture(id);
        return "OK";
    }
    
    @RequestMapping("deleteLectureProfessor")
    @ResponseBody
    public String deleteLectureProfessor(@RequestParam("professorID")int professorID) {
        LectureService.deleteLecture(professorID);
        return "OK";
    }


  

    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void invalidParameterExceptionHandler() {  }
}



