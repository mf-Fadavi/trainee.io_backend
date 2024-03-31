package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.entity.RoleEntity;
import io.trainee.organiser.user.request.UpdateRole;
import io.trainee.organiser.user.request.CreateRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<RoleEntity, UUID> {
    UpdateRole save(UpdateRole role);
    CreateRole save(CreateRole role);
}
