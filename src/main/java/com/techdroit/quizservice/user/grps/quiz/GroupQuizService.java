package com.techdroit.quizservice.user.grps.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupQuizService implements IGroupQuizService {

	@Autowired
	private IGroupQuizDAO groupQuizDAO;
	
	@Override
	public List<GroupQuiz> getAllGroupQuiz() {
		// TODO Auto-generated method stub
		return groupQuizDAO.getAllGroupQuiz();
	}
}