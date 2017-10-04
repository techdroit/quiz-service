package com.techdroit.quizservice.difflevel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DifficultyLevelController {

	@Autowired
	private IDifficultyLevelService difficultyLevelService;
	
	@GetMapping("difficulty/level")
	public ResponseEntity<List<DifficultyLevel>> getAllDifficultyLevel(){
		List<DifficultyLevel> list = difficultyLevelService.getAllDifficultyLevel();
		return new ResponseEntity<List<DifficultyLevel>>(list, HttpStatus.OK);
	}
}