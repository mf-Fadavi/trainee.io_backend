package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.TrainerEntity;
import io.trainee.organiser.user.request.CreateTrainer;
import io.trainee.organiser.user.request.UpdateTrainer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ITrainerService {

    List<TrainerEntity> findAll();
    Optional<TrainerEntity> findOneById(UUID trainerId);
    TrainerEntity createOne(CreateTrainer trainerInfo);

    UpdateTrainer updateOne(UpdateTrainer trainerInfo);
    void deleteOne(UUID trainerId);
}
