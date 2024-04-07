package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.TraineeEntity;
import io.trainee.organiser.user.exception.UserNotFoundException;
import io.trainee.organiser.user.mapper.TraineeMapperImpl;
import io.trainee.organiser.user.repository.TraineeRepository;
import io.trainee.organiser.user.request.CreateTraineeRequest;
import io.trainee.organiser.user.request.UpdateTraineeRequest;
import io.trainee.organiser.user.response.TraineeView;
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
    private AccountService accountService;
    private TraineeMapperImpl traineeMapper;
    @Override
    public List<TraineeEntity> findAll() {
        return traineeRepository.findAll();
    }

    @Override
    public Optional<TraineeEntity> findOneById(UUID traineeId) {
        return traineeRepository.findById(traineeId);
    }

    @Override
    public TraineeView createOne(CreateTraineeRequest traineeInfo) throws UserNotFoundException {
        var traineeEntity = traineeMapper.toEntity(traineeInfo);
        traineeEntity = traineeRepository.save(traineeEntity);
        return traineeMapper.toDto(traineeEntity);
    }

    @Override
    public UpdateTraineeRequest updateOne(UpdateTraineeRequest traineeInfo) {
        return traineeRepository.save(traineeInfo);
    }

    @Override
    public void deleteOne(UUID traineeId) {
        traineeRepository.deleteById(traineeId);
    }
}
