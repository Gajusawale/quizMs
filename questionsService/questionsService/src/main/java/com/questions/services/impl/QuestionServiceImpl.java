package com.questions.services.impl;

import com.questions.entity.Question;
import com.questions.repository.QuestionRepo;
import com.questions.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    QuestionRepo questionRepo;

    public QuestionServiceImpl(QuestionRepo questionRepo)
    {
        this.questionRepo=questionRepo;
    }

    @Override
    public Question create(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepo.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepo.findById(id).orElseThrow(()->new RuntimeException("questions with id is not found") );
    }

    @Override
    public List<Question> getQuestionOfQuiz(Long quizId) {
        return questionRepo.findByQuizId(quizId);
    }
}
