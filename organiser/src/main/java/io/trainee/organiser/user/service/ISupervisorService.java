package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.SupervisorEntity;
import io.trainee.organiser.user.request.CreateSupervisor;
import io.trainee.organiser.user.request.UpdateSupervisor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ISupervisorService {
    List<SupervisorEntity> findAll();
    Optional<SupervisorEntity> findOneById(UUID supervisorId);

    CreateSupervisor createOne(CreateSupervisor supervisorInfo);

    UpdateSupervisor updateOne(UpdateSupervisor supervisorInfo);

    void deleteOne(UUID supervisorId);
}
