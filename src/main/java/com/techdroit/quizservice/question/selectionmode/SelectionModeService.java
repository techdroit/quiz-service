package com.techdroit.quizservice.question.selectionmode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectionModeService implements ISelectionModeService {

	@Autowired
	private ISelectionModeDAO alertStatusDAO;
	
	@Override
	public List<SelectionMode> getAllSelectionModes() {
		// TODO Auto-generated method stub
		return alertStatusDAO.getAllSelectionModes();
	}
}