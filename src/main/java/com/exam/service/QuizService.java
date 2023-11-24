package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.entity.exam.Quiz;
@Service
public interface QuizService {
	
	public Quiz addQuiz(Quiz quiz);

    public Quiz updateQuiz(Long qId,Quiz quiz);

    public List<Quiz> getQuizzes();

    public Quiz getQuiz(Long quizId);

    public void deleteQuiz(Long quizId);

}
