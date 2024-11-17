package be.ipamc.vote.repositories;

import be.ipamc.vote.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Integer> {
}