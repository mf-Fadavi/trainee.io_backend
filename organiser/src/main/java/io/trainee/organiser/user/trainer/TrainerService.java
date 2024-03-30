package io.trainee.organiser.user.trainer;

import io.trainee.organiser.user.trainer.dto.CreateTrainer;
import io.trainee.organiser.user.trainer.dto.UpdateTrainer;
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

    public CreateTrainer createOne(CreateTrainer trainerInfo) {
        return trainerRepository.save(trainerInfo);
    }

    public UpdateTrainer updateOne(UpdateTrainer trainerInfo) {
        return trainerRepository.save(trainerInfo);
    }

    public void deleteOne(UUID trainerId) {
        trainerRepository.deleteById(trainerId);
    }
}
