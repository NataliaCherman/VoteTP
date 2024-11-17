package be.ipamc.vote.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AnswerId", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "Answer", nullable = false)
    private Boolean answer = false;

    @Column(name = "AnswerDate")
    private Instant answerDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AppUserId")
    private AppUser appUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QuestionId")
    private Question question;

}