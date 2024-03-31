package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.TraineeEntity;
import io.trainee.organiser.user.request.CreateTrainee;
import io.trainee.organiser.user.request.UpdateTrainee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ITraineeService {

    List<TraineeEntity> findAll();
    Optional<TraineeEntity> findOneById(UUID traineeId);
    CreateTrainee createOne(CreateTrainee traineeInfo);
    UpdateTrainee updateOne(UpdateTrainee traineeInfo);
    void deleteOne(UUID traineeId);
}
