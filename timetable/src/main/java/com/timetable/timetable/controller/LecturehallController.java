package com.timetable.timetable.controller;

import com.timetable.timetable.model.Lecturehall;
import com.timetable.timetable.service.LecturehallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@Controller
public class LecturehallController {

    private LecturehallService LecturehallService;

    @Autowired
    public LecturehallController(LecturehallService LecturehallService){
        this.LecturehallService = LecturehallService;
    }

    @RequestMapping("allLecturehalls")
    @ResponseBody
    public List<Lecturehall> getLecturehallList(){
        return LecturehallService.listAllLecturehalls();
    }
    
    @RequestMapping("getLecturehall")
    @ResponseBody
    public String getLecturehall(@RequestParam("id")int id) {
        LecturehallService.getLecturehall(id);
        return "OK";
    }

    @RequestMapping("createLecturehall")
    @ResponseBody
    public String createLecturehall(@RequestParam("id") int id,
    		@RequestParam("name") String name,
            @RequestParam("space") int space){
    	LecturehallService.createLecturehall(new Lecturehall(id,name,space));
    	return "OK";
    }
    
    
    @RequestMapping("editLecturehall")
    @ResponseBody
    public String editLecturehall(@RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("space") int space){
        	LecturehallService.editLecturehall(new Lecturehall(id,name,space));
        	return "OK";
        }
    
    @RequestMapping("deleteLecturehall")
    @ResponseBody
    public String deleteLecturehall(@RequestParam("id")int id) {
        LecturehallService.deleteLecturehall(id);
        return "OK";
    }


  

    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void invalidParameterExceptionHandler() {  }
}



