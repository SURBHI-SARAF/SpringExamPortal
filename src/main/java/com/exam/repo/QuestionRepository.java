package com.exam.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.exam.Question;
import com.exam.entity.exam.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	List<Question> findByQuiz(Quiz quiz);
	

}
