package com.exam.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.exam.Category;
import com.exam.entity.exam.Quiz;
import com.exam.service.QuizService;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("*")
public class QuizController {
	@Autowired
	private QuizService quizService;
	
	//add quiz service
    @PostMapping("/add")
    public ResponseEntity<Quiz> add(@RequestBody Quiz quiz) {
        return ResponseEntity.ok(this.quizService.addQuiz(quiz));
    }
    
    //get single quiz
    @GetMapping("/{qId}")
    public Quiz quiz(@PathVariable Long qId) {
        return this.quizService.getQuiz(qId);
    }

    //update quiz
    @PutMapping("/{qId}")
    public ResponseEntity<Quiz> updateQuiz(@PathVariable Long qId,@RequestBody Quiz quiz)
	{
		
	   Quiz updatedQuiz =quizService.updateQuiz(qId,quiz);
		if(updatedQuiz==null)
		{
			return ResponseEntity.notFound().build();
		}
		else
		{
			return ResponseEntity.ok(updatedQuiz);
		}
	}

    //get quiz
    @GetMapping("/all")
    public List<Quiz> quizzes() {
        return this.quizService.getQuizzes();
    }

    

    //delete the quiz
    @DeleteMapping("/del/{qId}")
    public void delete(@PathVariable Long qId) {
        this.quizService.deleteQuiz(qId);
    }

    
}
