package com.techdroit.quizservice.question.optionstatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz_ques_opt_sts")
public class QuestionOptionStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "opt_sts_id")
	private byte optionStatusId;
	
	@Column(name = "opt_sts_name")
	private String optionStatusName;
	
	@Column(name = "opt_sts_desc")
	private String optionStatusDescription;

	public byte getOptionStatusId() {
		return optionStatusId;
	}

	public void setOptionStatusId(byte optionStatusId) {
		this.optionStatusId = optionStatusId;
	}

	public String getOptionStatusName() {
		return optionStatusName;
	}

	public void setOptionStatusName(String optionStatusName) {
		this.optionStatusName = optionStatusName;
	}

	public String getOptionStatusDescription() {
		return optionStatusDescription;
	}

	public void setOptionStatusDescription(String optionStatusDescription) {
		this.optionStatusDescription = optionStatusDescription;
	}
}