package io.trainee.organiser.user.mapper;

import io.trainee.organiser.user.entity.RoleEntity;
import io.trainee.organiser.user.request.CreateRoleRequest;
import io.trainee.organiser.user.request.UpdateRoleRequest;
import io.trainee.organiser.user.response.RoleView;
import org.mapstruct.Mapper;
import org.mapstruct.SubclassExhaustiveStrategy;

@Mapper(componentModel = "spring", subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public abstract class RoleMapper {

    public abstract RoleView toDto (RoleEntity entity);

    public abstract RoleEntity toEntity (CreateRoleRequest createRoleDto);

    public abstract RoleEntity toEntity (UpdateRoleRequest updateRoleDto);
}
