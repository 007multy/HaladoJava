package com.uni.uni.controller;

import com.uni.uni.model.Practice;
import com.uni.uni.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@Controller
public class PracticeController {

    private PracticeService PracticeService;

    @Autowired
    public PracticeController(PracticeService PracticeService){
        this.PracticeService = PracticeService;
    }

    @RequestMapping("allPractices")
    @ResponseBody
    public List<Practice> getPracticeList(){
        return PracticeService.listAllPractices();
    }
    
    @RequestMapping("getPractice")
    @ResponseBody
    public String getPractice(@RequestParam("id")int id) {
        PracticeService.getPractice(id);
        return "OK";
    }

    @RequestMapping("createPractice")
    @ResponseBody
    public String createPractice(@RequestParam("id") int id,
        @RequestParam("name") String name,
        @RequestParam("date") String date){
    	PracticeService.createPractice(new Practice(id,name,date));
    	return "OK";
    }
    
    
    @RequestMapping("editPractice")
    @ResponseBody
    public String editPractice(@RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("date") String date){
        	PracticeService.editPractice(new Practice(id,name,date));
        	return "OK";
        }
    
    @RequestMapping("deletePractice")
    @ResponseBody
    public String deketePractice(@RequestParam("id")int id) {
        PracticeService.deletePractice(id);
        return "OK";
    }


  

    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void invalidParameterExceptionHandler() {  }
}



