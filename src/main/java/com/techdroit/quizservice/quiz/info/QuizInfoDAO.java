package com.techdroit.quizservice.quiz.info;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class QuizInfoDAO implements IQuizInfoDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<QuizInfo> getAllQuizInfo() {
		// TODO Auto-generated method stub
		String hql = "FROM QuizInfo";
		return (List<QuizInfo>)entityManager.createQuery(hql).getResultList();
	}
}