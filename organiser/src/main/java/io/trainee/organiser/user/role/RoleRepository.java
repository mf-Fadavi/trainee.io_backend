package io.trainee.organiser.user.role;

import io.trainee.organiser.user.role.dto.UpdateRole;
import io.trainee.organiser.user.role.dto.CreateRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<RoleEntity, UUID> {
    public UpdateRole save(UpdateRole role);
    public CreateRole save(CreateRole role);
}
