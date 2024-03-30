package io.trainee.organiser.user.trainee;

import io.trainee.organiser.user.trainee.dto.CreateTrainee;
import io.trainee.organiser.user.trainee.dto.UpdateTrainee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TraineeService {
    private TraineeRepository traineeRepository;

    public List<TraineeEntity> findAll() {
        return traineeRepository.findAll();
    }

    public Optional<TraineeEntity> findOneById(UUID traineeId) {
        return traineeRepository.findById(traineeId);
    }

    public CreateTrainee createOne(CreateTrainee traineeInfo) {
        return traineeRepository.save(traineeInfo);
    }

    public UpdateTrainee updateOne(UpdateTrainee traineeInfo) {
        return traineeRepository.save(traineeInfo);
    }

    public void deleteOne(UUID traineeId) {
        traineeRepository.deleteById(traineeId);
    }
}
