package com.techdroit.quizservice.difflevel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class DifficultyLevelDAO implements IDifficultyLevelDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DifficultyLevel> getAllDifficultyLevel() {
		// TODO Auto-generated method stub
		String hql = "FROM DifficultyLevel";
		return (List<DifficultyLevel>) entityManager.createQuery(hql).getResultList();
	}
}