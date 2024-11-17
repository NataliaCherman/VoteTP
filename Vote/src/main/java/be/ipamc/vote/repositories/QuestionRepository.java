package be.ipamc.vote.repositories;

import be.ipamc.vote.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}