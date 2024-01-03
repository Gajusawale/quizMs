package com.quiz.services.imp;

import com.quiz.dto.QuizDto;
import com.quiz.entity.Quiz;
import com.quiz.exceptions.QuizeNotFoundException;
import com.quiz.repository.QuizRepo;
import com.quiz.services.QuestionClient;
import com.quiz.services.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {
   private QuizRepo quizRepo;
   private QuestionClient questionClient;

    public QuizServiceImpl(QuizRepo quizRepo, QuestionClient questionClient) {
        this.quizRepo = quizRepo;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz addQuiz(QuizDto quizDto) {
        Quiz quiz=Quiz.build(0L,quizDto.getTitle(),quizDto.getQuestions());

        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {

      List<Quiz> quizzes= quizRepo.findAll();
     List<Quiz> newQuizList;
        newQuizList = quizzes.stream().map(quiz -> {
             quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));

         return quiz;
        }).collect(Collectors.toList());
        return newQuizList;
    }

    @Override
    public Quiz getById(Long id) {
        Quiz quiz= quizRepo.findById(id).orElseThrow(()->new QuizeNotFoundException("quiz not found with id " +id));

        quiz.setQuestions(questionClient.getQuestionOfQuiz(id));
        return quiz;
    }
}
