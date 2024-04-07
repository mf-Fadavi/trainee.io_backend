package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.TraineeEntity;
import io.trainee.organiser.user.exception.UserNotFoundException;
import io.trainee.organiser.user.request.CreateTraineeRequest;
import io.trainee.organiser.user.request.UpdateTraineeRequest;
import io.trainee.organiser.user.response.TraineeView;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ITraineeService {

    List<TraineeEntity> findAll();
    Optional<TraineeEntity> findOneById(UUID traineeId);
    TraineeView createOne(CreateTraineeRequest traineeInfo) throws UserNotFoundException;
    UpdateTraineeRequest updateOne(UpdateTraineeRequest traineeInfo);
    void deleteOne(UUID traineeId);
}
