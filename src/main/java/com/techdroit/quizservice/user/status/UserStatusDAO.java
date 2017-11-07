package com.techdroit.quizservice.user.status;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class UserStatusDAO implements IUserStatusDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserStatus> getAllAlertStatus() {
		// TODO Auto-generated method stub
		String hql = "FROM UserStatus";
		return (List<UserStatus>)entityManager.createQuery(hql).getResultList();
	}

}