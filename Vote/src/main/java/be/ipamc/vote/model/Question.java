package be.ipamc.vote.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QuestionId", nullable = false)
    private Integer id;

    @Size(max = 8)
    @Nationalized
    @Column(name = "Question", length = 8)
    private String question;

    @Column(name = "QuestionDate")
    private Instant questionDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AdminId")
    private AppUser admin;

    @OneToMany(mappedBy = "question")
    private Set<Answer> answers = new LinkedHashSet<>();

}