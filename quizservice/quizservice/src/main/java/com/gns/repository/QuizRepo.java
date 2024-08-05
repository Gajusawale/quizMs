package com.gns.repository;

import com.gns.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz,Long> {

}
