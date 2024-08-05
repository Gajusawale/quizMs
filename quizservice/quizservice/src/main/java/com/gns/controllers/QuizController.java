package com.gns.controllers;
import com.gns.entity.Quiz;
import com.gns.dto.QuizDto;
import com.gns.dto.QuizWithQuestionsId;
import com.gns.services.QuizService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController( QuizService quizService)
    {
        this.quizService=quizService;
    }

    @PostMapping
    public ResponseEntity<Quiz> create(@RequestBody @Valid QuizDto quizDto)
    {
        return new ResponseEntity<>(quizService.addQuiz(quizDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<QuizWithQuestionsId>> get()
    {
        return ResponseEntity.ok( quizService.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuizWithQuestionsId> getOne(@PathVariable Long id)
    {
        return ResponseEntity.ok(quizService.getById(id));
    }




}
