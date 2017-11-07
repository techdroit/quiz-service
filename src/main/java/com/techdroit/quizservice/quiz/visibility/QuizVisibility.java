package com.techdroit.quizservice.quiz.visibility;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz_vis_mode")
public class QuizVisibility {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vis_mode_id")
	private int visModeId;
	
	@Column(name = "vis_mode_name")
	private String visModeName;
	
	@Column(name = "vis_mode_desc")
	private String visModeDescription;

	public int getVisModeId() {
		return visModeId;
	}

	public void setVisModeId(int visModeId) {
		this.visModeId = visModeId;
	}

	public String getVisModeName() {
		return visModeName;
	}

	public void setVisModeName(String visModeName) {
		this.visModeName = visModeName;
	}

	public String getVisModeDescription() {
		return visModeDescription;
	}

	public void setVisModeDescription(String visModeDescription) {
		this.visModeDescription = visModeDescription;
	}
}