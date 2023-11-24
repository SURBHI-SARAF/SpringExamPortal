package com.exam.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.exam.entity.exam.Question;
import com.exam.entity.exam.Quiz;
import com.exam.repo.QuestionRepository;
import com.exam.repo.QuizRepository;
import com.exam.service.QuestionService;
@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private QuizRepository  quizRepository;

	@Override
	public Question addQuestion(Question question,Long id) {
		
		Optional<Quiz> op = quizRepository.findById(id);
		
		question.setQuiz(op.get());
		return this.questionRepository.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		
		return this.questionRepository.save(question);
	}

	@Override
	public List<Question> getQuestions() {
		
		return this.questionRepository.findAll();
	}

	@Override
	public Question getQuestion(Long questionId) {
		return this.questionRepository.findById(questionId).get();
	}

	@Override
	public void deleteQuestion(Long quesId) {
		this.questionRepository.deleteById(quesId);
		
	}

	@Override
    public List<Question> getQuestionsOfQuiz(Quiz quiz) {
        return this.questionRepository.findByQuiz(quiz);
    }


	

	

}
