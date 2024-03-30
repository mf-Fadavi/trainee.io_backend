package io.trainee.organiser.user.trainer;

import io.trainee.organiser.user.trainer.dto.CreateTrainer;
import io.trainee.organiser.user.trainer.dto.UpdateTrainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainerRepository extends JpaRepository<TrainerEntity, UUID> {

    public UpdateTrainer save(UpdateTrainer trainerInfo);
    public CreateTrainer save(CreateTrainer trainerInfo);
}
