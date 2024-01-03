package com.questions.services;

import com.questions.entity.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getOne(Long id);

    List<Question> getQuestionOfQuiz(Long quizId);

}
