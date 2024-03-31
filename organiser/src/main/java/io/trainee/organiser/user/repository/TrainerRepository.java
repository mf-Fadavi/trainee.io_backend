package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.entity.TrainerEntity;
import io.trainee.organiser.user.request.CreateTrainer;
import io.trainee.organiser.user.request.UpdateTrainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainerRepository extends JpaRepository<TrainerEntity, UUID> {

    UpdateTrainer save(UpdateTrainer trainerInfo);
    CreateTrainer save(CreateTrainer trainerInfo);
}
