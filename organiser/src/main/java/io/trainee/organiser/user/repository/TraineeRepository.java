package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.entity.TraineeEntity;
import io.trainee.organiser.user.request.UpdateTrainee;
import io.trainee.organiser.user.request.CreateTrainee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TraineeRepository extends JpaRepository<TraineeEntity, UUID> {
    UpdateTrainee save(UpdateTrainee traineeInfo);
    CreateTrainee save(CreateTrainee traineeInfo);
}
