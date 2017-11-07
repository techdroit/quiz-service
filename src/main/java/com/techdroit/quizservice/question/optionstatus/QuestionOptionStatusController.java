package com.techdroit.quizservice.question.optionstatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionOptionStatusController {

	@Autowired
	private IQuestionOptionStatusService questionOptionStatusService;
	
	@GetMapping("question/option/status")
	public ResponseEntity<List<QuestionOptionStatus>> getAllQuestionOptionStatus(){
		List<QuestionOptionStatus> list = questionOptionStatusService.getAllQuestionOptionStatus();
		return new ResponseEntity<List<QuestionOptionStatus>>(list, HttpStatus.OK);
	}
}