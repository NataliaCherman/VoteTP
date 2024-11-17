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
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AppRoleId", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Nationalized
    @Column(name = "Name", length = 50)
    private String name;

    @ManyToMany
    @JoinTable(name = "AppUser_AppRoles",
            joinColumns = @JoinColumn(name = "AppRoleId"),
            inverseJoinColumns = @JoinColumn(name = "AppUserId"))
    private Set<AppUser> appUsers = new LinkedHashSet<>();

}