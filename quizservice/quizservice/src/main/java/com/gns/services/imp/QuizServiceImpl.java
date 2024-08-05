package com.gns.services.imp;

import com.gns.dto.QuizDto;
import com.gns.dto.QuizWithQuestionsId;
import com.gns.entity.Question;
import com.gns.entity.Quiz;
import com.gns.exceptions.QuizeNotFoundException;
import com.gns.repository.QuizRepo;
import com.gns.services.QuestionClient;
import com.gns.services.QuizService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        Quiz quiz=Quiz.build(0L,quizDto.getTitle());

        return quizRepo.save(quiz);
    }

    @Override
    public List<QuizWithQuestionsId> get() {
        List<Quiz> quizzes= quizRepo.findAll();

//        System.out.println(quizzes);

        List<QuizWithQuestionsId> quizWithQuestionsIds=new ArrayList<>();

//        RestTemplate restTemplate=new RestTemplate();

        return quizzes.stream().map(this::convertQuizWithDto).collect(Collectors.toList());

    }
    private QuizWithQuestionsId convertQuizWithDto(Quiz quiz)
    {

            QuizWithQuestionsId quizWithQuestionsId=new QuizWithQuestionsId();
            quizWithQuestionsId.setQuiz(quiz);

//            Question question= restTemplate.getForObject("/question/quiz/"+quiz.getId(),Question.class);
            List<Question> question=questionClient.getQuestionOfQuiz(quiz.getId());
            quizWithQuestionsId.setQuestion(question);


        return quizWithQuestionsId;
    }

    @Override
    public QuizWithQuestionsId getById(Long id) {
        QuizWithQuestionsId quizWithQuestionsId=new QuizWithQuestionsId();
        Quiz quiz= quizRepo.findById(id).orElseThrow(()->new QuizeNotFoundException("quiz not found with id " +id));

        quizWithQuestionsId.setQuiz(quiz);
        quizWithQuestionsId.setQuestion(questionClient.getQuestionOfQuiz(id));

        return quizWithQuestionsId;
    }
}
