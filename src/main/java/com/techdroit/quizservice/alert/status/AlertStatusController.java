package com.techdroit.quizservice.alert.status;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlertStatusController {
	
	@Autowired
	private IAlertStatusService alertStatusService;
	
	@GetMapping("status/alert")
	public ResponseEntity<List<AlertStatus>> getAllAlertStatus(){
		List<AlertStatus> list = alertStatusService.getAllAlertStatus();
		return new ResponseEntity<List<AlertStatus>>(list, HttpStatus.OK);
	}
}