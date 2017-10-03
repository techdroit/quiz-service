package com.techdroit.quizservice.question.types;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class QuestionTypeDAO implements IQuestionTypeDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public QuestionType getQuestionTypeById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(QuestionType.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<QuestionType> getAllQuestionTypes() {
		// TODO Auto-generated method stub
		String hql = "FROM QuestionType";
		return (List<QuestionType>)entityManager.createQuery(hql).getResultList();
	}
}