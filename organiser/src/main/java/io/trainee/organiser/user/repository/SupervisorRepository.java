package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.SupervisorEntity;
import io.trainee.organiser.user.request.CreateSupervisorRequest;
import io.trainee.organiser.user.request.UpdateSupervisorRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = UserUrlConstants.SUPERVISORS_URL)
public interface SupervisorRepository extends JpaRepository<SupervisorEntity, UUID> {
    UpdateSupervisorRequest save(UpdateSupervisorRequest supervisorInfo);
    CreateSupervisorRequest save(CreateSupervisorRequest supervisorInfo);
}
