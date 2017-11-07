package com.techdroit.quizservice.quiz.status;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class QuizStatusDAO implements IQuizStatusDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<QuizStatus> getAllQuizStatus() {
		// TODO Auto-generated method stub
		String hql = "FROM QuizStatus";
		return (List<QuizStatus>)entityManager.createQuery(hql).getResultList();
	}

}