package com.techdroit.quizservice.alert.status;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class AlertStatusDAO implements IAlertStatusDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<AlertStatus> getAllAlertStatus() {
		// TODO Auto-generated method stub
		String hql = "FROM AlertStatus";
		return (List<AlertStatus>)entityManager.createQuery(hql).getResultList();
	}

}