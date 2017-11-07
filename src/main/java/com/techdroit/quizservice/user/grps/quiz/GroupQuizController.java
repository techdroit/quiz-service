package com.techdroit.quizservice.user.grps.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupQuizController {
	
	@Autowired
	private IGroupQuizService alertStatusService;
	
	@GetMapping("user/group/quiz")
	public ResponseEntity<List<GroupQuiz>> getAllGroupQuiz(){
		List<GroupQuiz> list = alertStatusService.getAllGroupQuiz();
		return new ResponseEntity<List<GroupQuiz>>(list, HttpStatus.OK);
	}
}