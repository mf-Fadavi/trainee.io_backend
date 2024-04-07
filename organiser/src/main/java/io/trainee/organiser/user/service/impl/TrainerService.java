package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.TrainerEntity;
import io.trainee.organiser.user.repository.TrainerRepository;
import io.trainee.organiser.user.request.CreateTrainerRequest;
import io.trainee.organiser.user.request.UpdateTrainerRequest;
import io.trainee.organiser.user.response.TrainerView;
import io.trainee.organiser.user.service.ITrainerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TrainerService implements ITrainerService {

    private TrainerRepository trainerRepository;

    @Override
    public List<TrainerEntity> findAll() {
        return trainerRepository.findAll();
    }

    @Override
    public Optional<TrainerEntity> findOneById(UUID trainerId) {
        return trainerRepository.findById(trainerId);
    }

    @Override
    public TrainerEntity createOne(TrainerEntity trainerInfo) {
        return trainerRepository.save(trainerInfo);
    }

    @Override
    public UpdateTrainerRequest updateOne(UpdateTrainerRequest trainerInfo) {
        return trainerRepository.save(trainerInfo);
    }

    @Override
    public void deleteOne(UUID trainerId) {
        trainerRepository.deleteById(trainerId);
    }

}
