package com.techdroit.quizservice.user.scores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class UserScoreDAO implements IUserScoreDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserScore> getAllUserScores() {
		// TODO Auto-generated method stub
		String hql = "FROM UserScore";
		return (List<UserScore>)entityManager.createQuery(hql).getResultList();
	}
}