package com.techdroit.quizservice.question;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quiz_ques")
public class Question implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ques_id")
	private long questionId;
	
	@Column(name="quiz_id")
	private long quizId;
	
	@Column(name="ques_name")
	private String questionName;
	
	@Column(name="ques_desc")
	private String questionDescription;
	
	@Column(name="status_id")
	private byte statusId;
	
	@Column(name="ques_type_id")
	private byte questionTypeId;
	
	@Column(name="diff_level_id")
	private byte difficultyLevelId;
	
	@Column(name="option_a")
	private String optionA;
	
	@Column(name="option_b")
	private String optionB;
	
	@Column(name="option_c")
	private String optionC;
	
	@Column(name="option_d")
	private String optionD;
	
	@Column(name="option_e")
	private String optionE;
	
	@Column(name="option_a_valid")
	private byte optionAStatus;
	
	@Column(name="option_b_valid")
	private byte optionBStatus;
	
	@Column(name="option_c_valid")
	private byte optionCStatus;
	
	@Column(name="option_d_valid")
	private byte optionDStatus;
	
	@Column(name="option_e_valid")
	private byte optionEStatus;
	
	@Column(name="mk_id")
	private long makerId;
	
	@Column(name="mk_date")
	private Timestamp makerDate;
	
	@Column(name="mk_comment")
	private String makerComment;

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public long getQuizId() {
		return quizId;
	}

	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String getQuestionDescription() {
		return questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}

	public byte getStatusId() {
		return statusId;
	}

	public void setStatusId(byte statusId) {
		this.statusId = statusId;
	}

	public byte getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(byte questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public byte getDifficultyLevelId() {
		return difficultyLevelId;
	}

	public void setDifficultyLevelId(byte difficultyLevelId) {
		this.difficultyLevelId = difficultyLevelId;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getOptionE() {
		return optionE;
	}

	public void setOptionE(String optionE) {
		this.optionE = optionE;
	}

	public byte getOptionAStatus() {
		return optionAStatus;
	}

	public void setOptionAStatus(byte optionAStatus) {
		this.optionAStatus = optionAStatus;
	}

	public byte getOptionBStatus() {
		return optionBStatus;
	}

	public void setOptionBStatus(byte optionBStatus) {
		this.optionBStatus = optionBStatus;
	}

	public byte getOptionCStatus() {
		return optionCStatus;
	}

	public void setOptionCStatus(byte optionCStatus) {
		this.optionCStatus = optionCStatus;
	}

	public byte getOptionDStatus() {
		return optionDStatus;
	}

	public void setOptionDStatus(byte optionDStatus) {
		this.optionDStatus = optionDStatus;
	}

	public byte getOptionEStatus() {
		return optionEStatus;
	}

	public void setOptionEStatus(byte optionEStatus) {
		this.optionEStatus = optionEStatus;
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