package com.quiz.services;

import com.quiz.dto.QuizDto;
import com.quiz.entity.Quiz;

import java.util.List;

public interface QuizService {

    Quiz addQuiz(QuizDto quizdto);

    List<Quiz> get();

    Quiz getById(Long id);
}
