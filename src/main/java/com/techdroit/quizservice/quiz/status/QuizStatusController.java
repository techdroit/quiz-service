package com.techdroit.quizservice.quiz.status;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizStatusController {
	
	@Autowired
	private IQuizStatusService alertStatusService;
	
	@GetMapping("quiz/status")
	public ResponseEntity<List<QuizStatus>> getAllQuizStatus(){
		List<QuizStatus> list = alertStatusService.getAllQuizStatus();
		return new ResponseEntity<List<QuizStatus>>(list, HttpStatus.OK);
	}
}