package com.techdroit.quizservice.question.selectionmode;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class SelectionModeDAO implements ISelectionModeDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SelectionMode> getAllSelectionModes() {
		// TODO Auto-generated method stub
		String hql = "FROM SelectionMode";
		return (List<SelectionMode>)entityManager.createQuery(hql).getResultList();
	}

}