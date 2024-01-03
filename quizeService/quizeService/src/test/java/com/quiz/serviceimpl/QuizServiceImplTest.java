package com.quiz.serviceimpl;

import com.quiz.dto.QuizDto;
import com.quiz.entity.Question;
import com.quiz.entity.Quiz;
import com.quiz.exceptions.QuizeNotFoundException;
import com.quiz.repository.QuizRepo;
import com.quiz.services.QuestionClient;
import com.quiz.services.imp.QuizServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@SpringBootTest
public class QuizServiceImplTest {

    @InjectMocks
    QuizServiceImpl quizService;

    @Mock
    QuizRepo quizRepo;

    @Mock
    QuestionClient questionClient;

    @Test
    public void getByIdTest()
    {

        when(quizRepo.findById(1L)).thenReturn(createQuiz());
        when(quizRepo.findById(2L)).thenThrow(new QuizeNotFoundException("quize is not found with id 2"));
//        when(questionClient.getQuestionOfQuiz(1L)).thenReturn(createQuiz().get().getQuestions());

        Quiz quiz=quizService.getById(1L);
        Quiz quiz1=quizService.getById(2L);

        assertEquals(quiz.getTitle(),"Java ");
//        assertThrows(q,)

//        assertEquals( quiz.getQuestions(),createQuiz().get().getQuestions());

    }

    @Test
    public void getByIdTestWithException()
    {

        when(quizRepo.findById(2L)).thenThrow(new QuizeNotFoundException("quiz is not found with id 2"));
//
        QuizeNotFoundException quizeNotFoundException=assertThrows(QuizeNotFoundException.class,
                ()->quizService.getById(2L));

        assertEquals(quizeNotFoundException.getMessage(),"quiz is not found with id 2");

    }




    // Adding test case for adding the data
//    @Test
//    public void addQuizTest() {
//        // Arrange
//        QuizDto quizDto = new QuizDto("Java Quiz", Arrays.asList(new Qu("What is Java?")));
//
//        // Assuming Quiz.build is a static method
//        when(Quiz.build(0L, "Java Quiz", Arrays.asList(new Question(1L, "What is Java?"))))
//                .thenReturn(new Quiz(1L, "Java Quiz", Arrays.asList(new Question(1L, "What is Java?"))));
//
//        when(quizRepo.save(any(Quiz.class)))
//                .thenReturn(new Quiz(1L, "Java Quiz", Arrays.asList(new Question(1L, "What is Java?"))));
//
//        // Act
//        Quiz addedQuiz = quizService.addQuiz(quizDto);
//
//        // Assert
//        assertNotNull(addedQuiz);
//        assertEquals("Java Quiz", addedQuiz.getTitle());
//        assertEquals(1L, addedQuiz.getId().longValue());
//        // Add more assertions as needed based on your specific implementation
//
//        // You can verify that the save method was called with the expected arguments
//        verify(quizRepo, times(1)).save(any(Quiz.class));
//    }




    private Optional<Quiz> createQuiz()
    {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(1L, "What is java"));

        Quiz quiz=Quiz.builder().id(1L).title("Java ").questions(questions).build();
        return Optional.of(quiz);
    }





}
