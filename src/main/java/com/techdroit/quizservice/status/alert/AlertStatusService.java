package com.techdroit.quizservice.status.alert;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertStatusService implements IAlertStatusService {

	@Autowired
	private IAlertStatusDAO alertStatusDAO;
	
	@Override
	public List<AlertStatus> getAllAlertStatus() {
		// TODO Auto-generated method stub
		return alertStatusDAO.getAllAlertStatus();
	}
}