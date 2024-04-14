package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.AdminEntity;
import io.trainee.organiser.user.request.CreateAdminRequest;
import io.trainee.organiser.user.request.UpdateAdminRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = UserUrlConstants.ADMINS_URL)
public interface AdminRepository extends JpaRepository<AdminEntity, UUID> {
    UpdateAdminRequest save(UpdateAdminRequest adminInfo);
    CreateAdminRequest save(CreateAdminRequest adminInfo);
}
