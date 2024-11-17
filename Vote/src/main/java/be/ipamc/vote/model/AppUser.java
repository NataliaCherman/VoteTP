package be.ipamc.vote.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AppUserId", nullable = false)
    private Integer id;

    @Size(max = 11)
    @Nationalized
    @Column(name = "NationalNumber", length = 11)
    private String nationalNumber;

    @Size(max = 10)
    @Nationalized
    @Column(name = "Firstname", length = 10)
    private String firstname;

    @Size(max = 10)
    @Nationalized
    @Column(name = "Lastname", length = 10)
    private String lastname;

    @Size(max = 200)
    @Nationalized
    @Column(name = "Password", length = 200)
    private String password;

    @OneToMany(mappedBy = "appUser")
    private Set<Answer> answers = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "appUser")
    private Set<AppRole> appRoles = new LinkedHashSet<>();

    @OneToMany(mappedBy = "admin")
    private Set<Question> questions = new LinkedHashSet<>();

}