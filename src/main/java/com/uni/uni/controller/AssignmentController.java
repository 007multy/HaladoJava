package com.uni.uni.controller;

import com.uni.uni.model.Assignment;
import com.uni.uni.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@Controller
public class AssignmentController {

    private AssignmentService AssignmentService;

    @Autowired
    public AssignmentController(AssignmentService AssignmentService){
        this.AssignmentService = AssignmentService;
    }

    @RequestMapping("allAssignments")
    @ResponseBody
    public List<Assignment> getAssignmentList(){
        return AssignmentService.listAllAssignments();
    }
    
    @RequestMapping("getAssignment")
    @ResponseBody
    public String getAssignment(@RequestParam("id")int id) {
        AssignmentService.getAssignment(id);
        return "OK";
    }

    @RequestMapping("createAssignment")
    @ResponseBody
    public String createAssignment(@RequestParam("id") int id,
        @RequestParam("name") String name,
        @RequestParam("deadline") String deadline){
    	AssignmentService.createAssignment(new Assignment(id,name,deadline));
    	return "OK";
    }
    
    
    @RequestMapping("editAssignment")
    @ResponseBody
    public String editAssignment(@RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("deadline") String deadline){
        	AssignmentService.editAssignment(new Assignment(id,name,deadline));
        	return "OK";
        }
    
    @RequestMapping("deleteAssignment")
    @ResponseBody
    public String deketeAssignment(@RequestParam("id")int id) {
        AssignmentService.deleteAssignment(id);
        return "OK";
    }


  

    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void invalidParameterExceptionHandler() {  }
}



