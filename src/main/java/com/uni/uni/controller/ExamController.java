package com.uni.uni.controller;

import com.uni.uni.model.Exam;
import com.uni.uni.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@Controller
public class ExamController {

    private ExamService ExamService;

    @Autowired
    public ExamController(ExamService ExamService){
        this.ExamService = ExamService;
    }

    @RequestMapping("allExams")
    @ResponseBody
    public List<Exam> getExamList(){
        return ExamService.listAllExams();
    }
    
    @RequestMapping("getExam")
    @ResponseBody
    public String getExam(@RequestParam("id")int id) {
        ExamService.getExam(id);
        return "OK";
    }

    @RequestMapping("createExam")
    @ResponseBody
    public String createExam(@RequestParam("id") int id,
        @RequestParam("name") String name,
        @RequestParam("date") String date){
    	ExamService.createExam(new Exam(id,name,date));
    	return "OK";
    }
    
    
    @RequestMapping("editExam")
    @ResponseBody
    public String editExam(@RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("date") String date){
        	ExamService.editExam(new Exam(id,name,date));
        	return "OK";
        }
    
    @RequestMapping("deleteExam")
    @ResponseBody
    public String deketeExam(@RequestParam("id")int id) {
        ExamService.deleteExam(id);
        return "OK";
    }


  

    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void invalidParameterExceptionHandler() {  }
}



