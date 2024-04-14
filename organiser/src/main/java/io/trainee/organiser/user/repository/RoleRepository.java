package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
import java.util.UUID;

@RepositoryRestResource(path = UserUrlConstants.ROLES_URL, collectionResourceRel = UserUrlConstants.ROLES_URL)
public interface RoleRepository extends JpaRepository<RoleEntity, UUID> {

    Optional<RoleEntity> findOneByName(String roleName);
}
