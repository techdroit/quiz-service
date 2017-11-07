package com.techdroit.quizservice.question.selectionmode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz_ques_sel_mode")
public class SelectionMode {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sel_mode_id")
	private int selectionModeId;
	
	@Column(name = "sel_mode_name")
	private String selectionModeName;
	
	@Column(name = "sel_mode_desc")
	private String selectionModeDesc;

	public int getSelectionModeId() {
		return selectionModeId;
	}

	public void setSelectionModeId(int selectionModeId) {
		this.selectionModeId = selectionModeId;
	}

	public String getSelectionModeName() {
		return selectionModeName;
	}

	public void setSelectionModeName(String selectionModeName) {
		this.selectionModeName = selectionModeName;
	}

	public String getSelectionModeDesc() {
		return selectionModeDesc;
	}

	public void setSelectionModeDesc(String selectionModeDesc) {
		this.selectionModeDesc = selectionModeDesc;
	}
}