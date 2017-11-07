package com.techdroit.quizservice.user.scores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserScoreController {
	
	@Autowired
	private IUserScoreService userScoreService;
	
	@GetMapping("user/scores")
	public ResponseEntity<List<UserScore>> getAllUserScores(){
		List<UserScore> list = userScoreService.getAllUserScores();
		return new ResponseEntity<List<UserScore>>(list, HttpStatus.OK);
	}
}