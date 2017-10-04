package com.techdroit.quizservice.difflevel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz_diff_level")
public class DifficultyLevel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "diff_level_id")
	private int diffLevelId;
	
	@Column(name = "diff_level_name")
	private String diffLevelName;
	
	@Column(name = "diff_level_desc")
	private String diffLevelDescrition;

	public int getDiffLevelId() {
		return diffLevelId;
	}

	public void setDiffLevelId(int diffLevelId) {
		this.diffLevelId = diffLevelId;
	}

	public String getDiffLevelName() {
		return diffLevelName;
	}

	public void setDiffLevelName(String diffLevelName) {
		this.diffLevelName = diffLevelName;
	}

	public String getDiffLevelDescrition() {
		return diffLevelDescrition;
	}

	public void setDiffLevelDescrition(String diffLevelDescrition) {
		this.diffLevelDescrition = diffLevelDescrition;
	}
}