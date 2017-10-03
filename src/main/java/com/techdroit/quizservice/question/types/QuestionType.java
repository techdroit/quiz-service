package com.techdroit.quizservice.question.types;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quiz_ques_types")
public class QuestionType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ques_type_id")
	private int questionTypeId;
	
	@Column(name="ques_type_name")
	private String questionTypeName;
	
	@Column(name="ques_type_desc")
	private String questionTypeDescription;

	public int getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(int questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public String getQuestionTypeName() {
		return questionTypeName;
	}

	public void setQuestionTypeName(String questionTypeName) {
		this.questionTypeName = questionTypeName;
	}

	public String getQuestionTypeDescription() {
		return questionTypeDescription;
	}

	public void setQuestionTypeDescription(String questionTypeDescription) {
		this.questionTypeDescription = questionTypeDescription;
	}
}