package com.techdroit.quizservice.difflevel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DifficultyLevelService implements IDifficultyLevelService{

	@Autowired
	private IDifficultyLevelDAO difficultyLevelDAO;
	
	@Override
	public List<DifficultyLevel> getAllDifficultyLevel() {
		// TODO Auto-generated method stub
		return difficultyLevelDAO.getAllDifficultyLevel();
	}
}