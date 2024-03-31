package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.entity.SupervisorEntity;
import io.trainee.organiser.user.request.CreateSupervisor;
import io.trainee.organiser.user.request.UpdateSupervisor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupervisorRepository extends JpaRepository<SupervisorEntity, UUID> {
    UpdateSupervisor save(UpdateSupervisor supervisorInfo);
    CreateSupervisor save(CreateSupervisor supervisorInfo);
}
