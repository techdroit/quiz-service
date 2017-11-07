package com.techdroit.quizservice.user.roles;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class UserRoleDAO implements IUserRoleDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserRole> getAllUserRoles() {
		// TODO Auto-generated method stub
		String hql = "FROM UserRole";
		return (List<UserRole>)entityManager.createQuery(hql).getResultList();
	}

}