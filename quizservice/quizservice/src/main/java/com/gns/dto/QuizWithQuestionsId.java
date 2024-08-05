package com.gns.dto;

import com.gns.entity.Question;
import com.gns.entity.Quiz;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuizWithQuestionsId {

    private Quiz quiz;

    private List<Question> question;


}
