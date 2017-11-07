package com.techdroit.quizservice.quiz.info;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizInfoController {

	@Autowired
	private IQuizInfoService quizInfoService;
	
	@GetMapping("quiz/info")
	public ResponseEntity<List<QuizInfo>> getAllQuizInfo(){
		List<QuizInfo> list = quizInfoService.getAllQuizInfo();
		return new ResponseEntity<List<QuizInfo>>(list, HttpStatus.OK);
	}
}