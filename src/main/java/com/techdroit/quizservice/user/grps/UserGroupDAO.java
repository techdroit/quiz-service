package com.techdroit.quizservice.user.grps;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class UserGroupDAO implements IUserGroupDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserGroup> getAllUserGroups() {
		// TODO Auto-generated method stub
		String hql = "FROM UserGroup";
		return (List<UserGroup>)entityManager.createQuery(hql).getResultList();
	}

}