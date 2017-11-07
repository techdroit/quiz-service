package com.techdroit.quizservice.user.grps.quiz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz_user_grps_quiz")
public class GroupQuiz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "grp_id")
	private long groupId;
	
	@Column(name = "quiz_id")
	private long quizId;

	@Column(name = "no_of_attempts")
	private byte noOfAttempts;

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public long getQuizId() {
		return quizId;
	}

	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}

	public byte getNoOfAttempts() {
		return noOfAttempts;
	}

	public void setNoOfAttempts(byte noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}
}