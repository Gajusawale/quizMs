package com.questions.repository;

import com.questions.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question,Long> {

    List<Question> findByQuizId(Long quizId);
}
