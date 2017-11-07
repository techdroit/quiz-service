package com.techdroit.quizservice.user.grps;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz_user_grps")
public class UserGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "grp_id")
	private long groupId;
	
	@Column(name = "grp_desc")
	private String groupDescription;
	
	@Column(name = "mk_id")
	private long makerId;
	
	@Column(name = "mk_date")
	private Timestamp makerDate;
	
	@Column(name = "mk_comment")
	private String makerComment;

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public long getMakerId() {
		return makerId;
	}

	public void setMakerId(long makerId) {
		this.makerId = makerId;
	}

	public Timestamp getMakerDate() {
		return makerDate;
	}

	public void setMakerDate(Timestamp makerDate) {
		this.makerDate = makerDate;
	}

	public String getMakerComment() {
		return makerComment;
	}

	public void setMakerComment(String makerComment) {
		this.makerComment = makerComment;
	}
}