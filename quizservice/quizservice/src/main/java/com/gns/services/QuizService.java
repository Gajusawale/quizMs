package com.gns.services;

import com.gns.dto.QuizDto;
import com.gns.dto.QuizWithQuestionsId;
import com.gns.entity.Quiz;

import java.util.List;

public interface QuizService {

    Quiz addQuiz(QuizDto quizdto);

    List<QuizWithQuestionsId> get();

    QuizWithQuestionsId getById(Long id);
}
