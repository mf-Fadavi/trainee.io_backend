package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.RoleEntity;
import io.trainee.organiser.user.request.CreateRole;
import io.trainee.organiser.user.request.UpdateRole;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IRoleService {

    List<RoleEntity> findAll();

    Optional<RoleEntity> findOneById(UUID roleId);

    CreateRole createOne(CreateRole role);

    UpdateRole updateOne(UpdateRole role);

    void deleteOne(UUID roleId);
}
