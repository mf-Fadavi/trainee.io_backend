package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.TrainerEntity;
import io.trainee.organiser.user.repository.TrainerRepository;
import io.trainee.organiser.user.request.CreateTrainer;
import io.trainee.organiser.user.request.UpdateTrainer;
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
    public TrainerEntity createOne(CreateTrainer trainerInfo) {
        return trainerRepository.save(mapDtoToEntity(trainerInfo));
    }

    @Override
    public UpdateTrainer updateOne(UpdateTrainer trainerInfo) {
        return trainerRepository.save(trainerInfo);
    }

    @Override
    public void deleteOne(UUID trainerId) {
        trainerRepository.deleteById(trainerId);
    }

    private TrainerEntity mapDtoToEntity(CreateTrainer createTrainerDto) {
        var trainerEntity = new TrainerEntity();
        trainerEntity.setFirstName(createTrainerDto.firstName());
        trainerEntity.setLastName(createTrainerDto.lastName());
        return trainerEntity;
    }
}
