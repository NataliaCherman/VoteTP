package be.ipamc.vote.DTO;

import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link be.ipamc.vote.model.AppRole}
 */
@Value
public class AppRoleDto implements Serializable {
    Integer id;
    @Size(max = 50)
    String name;
}