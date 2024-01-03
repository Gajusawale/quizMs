package com.questions.controller;

import com.questions.entity.Question;
import com.questions.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService)
    {
       this.questionService=questionService;
    }


    @PostMapping
    public Question createQue(@RequestBody Question question)
    {
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAll()
    {
        return questionService.get();
    }

    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id)
    {
        return questionService.getOne(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuizId(@PathVariable Long quizId)
    {
        return questionService.getQuestionOfQuiz(quizId);
    }


}
