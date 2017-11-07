package com.techdroit.quizservice.quiz.visibility;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class QuizVisibilityDAO implements IQuizVisibilityDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<QuizVisibility> getAllQuizVisibility() {
		// TODO Auto-generated method stub
		String hql = "FROM QuizVisibility";
		return (List<QuizVisibility>)entityManager.createQuery(hql).getResultList();
	}

}