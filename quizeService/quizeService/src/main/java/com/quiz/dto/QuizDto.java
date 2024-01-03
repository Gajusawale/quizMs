package com.quiz.dto;


import com.quiz.entity.Question;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.util.List;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class QuizDto {


    @NotNull(message = " title shouldn't be null")
    private String title;

    transient private List<Question> questions;
}
