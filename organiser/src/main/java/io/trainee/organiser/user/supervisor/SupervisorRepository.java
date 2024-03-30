package io.trainee.organiser.user.supervisor;

import io.trainee.organiser.user.supervisor.dto.CreateSupervisor;
import io.trainee.organiser.user.supervisor.dto.UpdateSupervisor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupervisorRepository extends JpaRepository<SupervisorEntity, UUID> {
    public UpdateSupervisor save(UpdateSupervisor supervisorInfo);
    public CreateSupervisor save(CreateSupervisor supervisorInfo);
}
