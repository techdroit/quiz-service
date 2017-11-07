package com.techdroit.quizservice.question.optionstatus;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class QuestionOptionStatusDAO implements IQuestionOptionStatusDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<QuestionOptionStatus> getAllQuestionOptionStatus() {
		// TODO Auto-generated method stub
		String hql = "FROM QuestionOptionStatus";
		return (List<QuestionOptionStatus>)entityManager
				.createQuery(hql).getResultList();
	}
}