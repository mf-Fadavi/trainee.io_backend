package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.TraineeEntity;
import io.trainee.organiser.user.repository.TraineeRepository;
import io.trainee.organiser.user.request.CreateTrainee;
import io.trainee.organiser.user.request.UpdateTrainee;
import io.trainee.organiser.user.service.ITraineeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TraineeService implements ITraineeService {
    private TraineeRepository traineeRepository;

    @Override
    public List<TraineeEntity> findAll() {
        return traineeRepository.findAll();
    }

    @Override
    public Optional<TraineeEntity> findOneById(UUID traineeId) {
        return traineeRepository.findById(traineeId);
    }

    @Override
    public CreateTrainee createOne(CreateTrainee traineeInfo) {
        return traineeRepository.save(traineeInfo);
    }

    @Override
    public UpdateTrainee updateOne(UpdateTrainee traineeInfo) {
        return traineeRepository.save(traineeInfo);
    }

    @Override
    public void deleteOne(UUID traineeId) {
        traineeRepository.deleteById(traineeId);
    }
}
