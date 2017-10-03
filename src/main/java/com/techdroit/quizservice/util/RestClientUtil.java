package com.techdroit.quizservice.util;

import java.net.URI;
import java.sql.Timestamp;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.techdroit.quizservice.question.Question;

public class RestClientUtil {
	
	public void getQuestionByIdDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/quizservice/question/{id}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Question> responseEntity = 
				restTemplate.exchange(url, HttpMethod.GET, requestEntity, Question.class, 2);
		Question question = responseEntity.getBody();
		System.out.println("Id: " + question.getQuestionName());
	}

	public void getAllQuestionsDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/quizservice/questions";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Question[]> responseEntity = 
				restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Question[].class);
		Question[] questions = responseEntity.getBody();
		for (Question question : questions) {
			String s = String.format("%-5s%-5s",question.getQuestionId(), question.getQuestionName());
			System.out.println(s);
		}
	}

	public void addQuestionDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/quizservice/question";
		Question objQuestion = new Question();
		objQuestion.setQuizId(1);
		objQuestion.setQuestionName("What is the capital of Nigeria ______");
		objQuestion.setStatusId((byte)1);
		objQuestion.setQuestionTypeId((byte)2);
		objQuestion.setDifficultyLevelId((byte)1);
		objQuestion.setOptionA("Abuja");
		objQuestion.setOptionB("Lagos");
		objQuestion.setOptionC("Ibadan");
		objQuestion.setOptionD("Oshogbo");
		objQuestion.setOptionE("Osun");
		objQuestion.setOptionAStatus((byte)1);
		objQuestion.setOptionBStatus((byte)2);
		objQuestion.setOptionCStatus((byte)2);
		objQuestion.setOptionDStatus((byte)2);
		objQuestion.setOptionEStatus((byte)2);
		objQuestion.setMakerId(1);
		objQuestion.setMakerDate(new Timestamp(System.currentTimeMillis()));
		HttpEntity<Question> requestEntity = new HttpEntity<Question>(objQuestion, headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println(uri.getPath());
	}

	public void updateQuestionDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/quizservice/question";
		Question objQuestion = new Question();
		objQuestion.setQuestionId(14);
		objQuestion.setQuestionName("I am asking again that what is the capital of Nigeria __________");
		HttpEntity<Question> requestEntity = new HttpEntity<Question>(objQuestion, headers);
		restTemplate.put(url, requestEntity);
	}

	public void deleteQuestionDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/quizservice/question/{id}";
		HttpEntity<Question> requestEntity = new HttpEntity<Question>(headers);
		restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, 14);
	}

	public static void main(String args[]) {
		RestClientUtil util = new RestClientUtil();
		//util.getQuestionByIdDemo();
		//util.getAllQuestionsDemo();
		//util.addQuestionDemo();
		//util.updateQuestionDemo();
		util.deleteQuestionDemo();
	}
}