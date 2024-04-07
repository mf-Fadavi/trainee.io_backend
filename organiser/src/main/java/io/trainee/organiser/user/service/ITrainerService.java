package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.TrainerEntity;
import io.trainee.organiser.user.request.CreateTrainerRequest;
import io.trainee.organiser.user.request.UpdateTrainerRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ITrainerService {

    List<TrainerEntity> findAll();
    Optional<TrainerEntity> findOneById(UUID trainerId);
    TrainerEntity createOne(TrainerEntity trainerInfo);

    UpdateTrainerRequest updateOne(UpdateTrainerRequest trainerInfo);
    void deleteOne(UUID trainerId);
}
