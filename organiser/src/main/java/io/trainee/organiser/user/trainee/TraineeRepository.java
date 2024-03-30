package io.trainee.organiser.user.trainee;

import io.trainee.organiser.user.trainee.dto.UpdateTrainee;
import io.trainee.organiser.user.trainee.dto.CreateTrainee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TraineeRepository extends JpaRepository<TraineeEntity, UUID> {
    public UpdateTrainee save(UpdateTrainee traineeInfo);
    public CreateTrainee save(CreateTrainee traineeInfo);
}
