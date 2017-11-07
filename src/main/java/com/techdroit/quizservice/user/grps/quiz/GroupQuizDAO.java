package com.techdroit.quizservice.user.grps.quiz;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class GroupQuizDAO implements IGroupQuizDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<GroupQuiz> getAllGroupQuiz() {
		// TODO Auto-generated method stub
		String hql = "FROM GroupQuiz";
		return (List<GroupQuiz>)entityManager.createQuery(hql).getResultList();
	}

}