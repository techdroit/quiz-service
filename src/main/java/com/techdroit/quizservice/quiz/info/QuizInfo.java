package com.techdroit.quizservice.quiz.info;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quiz_info")
public class QuizInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="quiz_id")
	private long quizId;
	
	@Column(name="quiz_name")
	private String quizName;
	
	@Column(name="quiz_desc")
	private String quizDescription;
	
	@Column(name="no_of_total_ques")
	private int noOfTotalQuestions;
	
	@Column(name="no_of_ques_allowed")
	private int noOfQuestionsAllowed;
	
	@Column(name="status_id")
	private byte statusId;
	
	@Column(name="str_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="time_allowed")
	private byte timeAllowed;
	
	@Column(name="no_of_attempts")
	private byte noOfAttempts;
	
	@Column(name="passing_score")
	private byte passingScore;
	
	@Column(name="dis_mode_id")
	private byte displayModeId;
	
	@Column(name="sel_mode_id")
	private byte selectionModeId;
	
	@Column(name="vis_mode_id")
	private byte visibilityModeId;
	
	@Column(name="mk_id")
	private long makerId;
	
	@Column(name="mk_date")
	private Date makerDate;
	
	@Column(name="mk_comment")
	private String makerComment;

	public long getQuizId() {
		return quizId;
	}

	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}

	public String getQuizDescription() {
		return quizDescription;
	}

	public void setQuizDescription(String quizDescription) {
		this.quizDescription = quizDescription;
	}

	public int getNoOfTotalQuestions() {
		return noOfTotalQuestions;
	}

	public void setNoOfTotalQuestions(int noOfTotalQuestions) {
		this.noOfTotalQuestions = noOfTotalQuestions;
	}

	public int getNoOfQuestionsAllowed() {
		return noOfQuestionsAllowed;
	}

	public void setNoOfQuestionsAllowed(int noOfQuestionsAllowed) {
		this.noOfQuestionsAllowed = noOfQuestionsAllowed;
	}

	public byte getStatusId() {
		return statusId;
	}

	public void setStatusId(byte statusId) {
		this.statusId = statusId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public byte getTimeAllowed() {
		return timeAllowed;
	}

	public void setTimeAllowed(byte timeAllowed) {
		this.timeAllowed = timeAllowed;
	}

	public byte getNoOfAttempts() {
		return noOfAttempts;
	}

	public void setNoOfAttempts(byte noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}

	public byte getPassingScore() {
		return passingScore;
	}

	public void setPassingScore(byte passingScore) {
		this.passingScore = passingScore;
	}

	public byte getDisplayModeId() {
		return displayModeId;
	}

	public void setDisplayModeId(byte displayModeId) {
		this.displayModeId = displayModeId;
	}

	public byte getSelectionModeId() {
		return selectionModeId;
	}

	public void setSelectionModeId(byte selectionModeId) {
		this.selectionModeId = selectionModeId;
	}

	public byte getVisibilityModeId() {
		return visibilityModeId;
	}

	public void setVisibilityModeId(byte visibilityModeId) {
		this.visibilityModeId = visibilityModeId;
	}

	public long getMakerId() {
		return makerId;
	}

	public void setMakerId(long makerId) {
		this.makerId = makerId;
	}

	public Date getMakerDate() {
		return makerDate;
	}

	public void setMakerDate(Date makerDate) {
		this.makerDate = makerDate;
	}

	public String getMakerComment() {
		return makerComment;
	}

	public void setMakerComment(String makerComment) {
		this.makerComment = makerComment;
	}
}