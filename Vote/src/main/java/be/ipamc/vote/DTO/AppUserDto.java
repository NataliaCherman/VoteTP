package be.ipamc.vote.DTO;

import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link be.ipamc.vote.model.AppUser}
 */
@Value
public class AppUserDto implements Serializable {
    Integer id;
    @Size(max = 11)
    String nationalNumber;
    @Size(max = 10)
    String firstname;
    @Size(max = 10)
    String lastname;
    @Size(max = 200)
    String password;
    Set<AppRoleDto> appRoles;
}