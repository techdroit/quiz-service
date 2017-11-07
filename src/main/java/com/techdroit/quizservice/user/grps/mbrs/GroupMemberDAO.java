package com.techdroit.quizservice.user.grps.mbrs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class GroupMemberDAO implements IGroupMemberDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<GroupMember> getAllGroupMembers() {
		// TODO Auto-generated method stub
		String hql = "FROM GroupMember";
		return (List<GroupMember>)entityManager.createQuery(hql).getResultList();
	}

}