package be.ipamc.vote.repositories;

import be.ipamc.vote.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}