package com.techdroit.quizservice.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.gson.Gson;

@Controller
// @RequestMapping("quiz")
public class QuestionController {

	@Autowired
	private IQuestionService questionService;

	@GetMapping("question/{id}")
	public ResponseEntity<Question> getQuestionById(@PathVariable("id") Long questionId) {
		Question question = questionService.getQuestionById(questionId);
		return new ResponseEntity<Question>(question, HttpStatus.OK);
	}

	@GetMapping("questions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		List<Question> list = questionService.getAllQuestions();
		return new ResponseEntity<List<Question>>(list, HttpStatus.OK);
	}
	
	@GetMapping("questions/{id}")
	public ResponseEntity<List<Question>> getAllQuestionsByQuizId(@PathVariable("id") Long quizId) {
		List<Question> list = questionService.getAllQuestionsByQuizId(quizId);
		return new ResponseEntity<List<Question>>(list, HttpStatus.OK);
	}

	@PostMapping("question")
	public ResponseEntity<Void> addQuestion(@RequestBody Question question, UriComponentsBuilder builder) {
		boolean flag = questionService.addQuestion(question);
		if (flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/question/{id}").buildAndExpand(question.getQuestionId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@PutMapping("question")
	public ResponseEntity<Question> updateQuestion(@RequestBody Question question) {
		questionService.updateQuestion(question);
		return new ResponseEntity<Question>(question, HttpStatus.OK);
	}

	@DeleteMapping("question/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Long id) {
		questionService.deleteQuestion(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}