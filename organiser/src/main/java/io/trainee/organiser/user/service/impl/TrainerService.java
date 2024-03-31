package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.TrainerEntity;
import io.trainee.organiser.user.repository.TrainerRepository;
import io.trainee.organiser.user.request.CreateTrainer;
import io.trainee.organiser.user.request.UpdateTrainer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TrainerService {

    private TrainerRepository trainerRepository;

    public List<TrainerEntity> findAll() {
        return trainerRepository.findAll();
    }

    public Optional<TrainerEntity> findOneById(UUID trainerId) {
        return trainerRepository.findById(trainerId);
    }

    public TrainerEntity createOne(CreateTrainer trainerInfo) {
        return trainerRepository.save(mapDtoToEntity(trainerInfo));
    }

    public UpdateTrainer updateOne(UpdateTrainer trainerInfo) {
        return trainerRepository.save(trainerInfo);
    }

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
