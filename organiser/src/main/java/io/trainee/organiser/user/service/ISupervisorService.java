package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.SupervisorEntity;
import io.trainee.organiser.user.request.CreateSupervisorRequest;
import io.trainee.organiser.user.request.UpdateSupervisorRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ISupervisorService {
    List<SupervisorEntity> findAll();
    Optional<SupervisorEntity> findOneById(UUID supervisorId);

    CreateSupervisorRequest createOne(CreateSupervisorRequest supervisorInfo);

    UpdateSupervisorRequest updateOne(UpdateSupervisorRequest supervisorInfo);

    void deleteOne(UUID supervisorId);
}
