package com.techdroit.quizservice.question.selectionmode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectionModeController {
	
	@Autowired
	private ISelectionModeService alertStatusService;
	
	@GetMapping("selection/mode")
	public ResponseEntity<List<SelectionMode>> getAllSelectionModes(){
		List<SelectionMode> list = alertStatusService.getAllSelectionModes();
		return new ResponseEntity<List<SelectionMode>>(list, HttpStatus.OK);
	}
}