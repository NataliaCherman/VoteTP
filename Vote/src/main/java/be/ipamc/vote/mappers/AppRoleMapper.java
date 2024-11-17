package be.ipamc.vote.mappers;

import be.ipamc.vote.DTO.AppRoleDto;
import be.ipamc.vote.model.AppRole;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AppRoleMapper {
    AppRole toEntity(AppRoleDto appRoleDto);

    AppRoleDto toDto(AppRole appRole);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AppRole partialUpdate(AppRoleDto appRoleDto, @MappingTarget AppRole appRole);
}