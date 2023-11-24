package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.entity.exam.Question;
import com.exam.entity.exam.Quiz;
@Service
public interface QuestionService {
	
	 public Question addQuestion(Question question,Long id);

	    public Question updateQuestion(Question question);

	    public List<Question> getQuestions();

	    public Question getQuestion(Long questionId);

	    public List<Question> getQuestionsOfQuiz(Quiz quiz);

	    public void deleteQuestion(Long quesId);
	    
	    //public Question findByquiz_q_id(Long qId);
	    //List<Question> findByQuiz(Quiz quiz);
	
	

}
