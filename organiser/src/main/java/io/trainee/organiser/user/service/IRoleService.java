package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.RoleEntity;
import io.trainee.organiser.user.request.CreateRoleRequest;
import io.trainee.organiser.user.response.RoleView;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IRoleService {

    List<RoleEntity> findAll();

    Optional<RoleEntity> findOneById(UUID roleId);

    Optional<RoleEntity> findOneByName(String roleName);

    RoleView createOne(CreateRoleRequest role);

    void deleteOne(UUID roleId);
}
