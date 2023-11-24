package com.exam.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.exam.Category;
import com.exam.entity.exam.Quiz;
import com.exam.repo.QuizRepository;
import com.exam.service.QuizService;
@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepository quizRepository;

	@Override
	public Quiz addQuiz(Quiz quiz) {
		
		return this.quizRepository.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Long qId,Quiz quiz) {
		Optional<Quiz> optionalQuiz = quizRepository.findById(qId);
		if(optionalQuiz.isPresent())
		{
			Quiz existingQuiz =  optionalQuiz.get();
			 existingQuiz.setTitle(quiz.getTitle());
			 existingQuiz.setDescription(quiz.getDescription());
			 existingQuiz.setMaxMarks(quiz.getMaxMarks());
			 existingQuiz.setNumberOfQuestions(quiz.getNumberOfQuestions());
			 
			
			return quizRepository.save(existingQuiz);
		}
		return null;
	}

	@Override
	public List<Quiz> getQuizzes() {
		
		return this.quizRepository.findAll();
	}

	@Override
	public Quiz getQuiz(Long qId) {
		
		return this.quizRepository.findById(qId).get();
	}

	@Override
	public void deleteQuiz(Long qId) {
		this.quizRepository.deleteById(qId);
		
	}

}
