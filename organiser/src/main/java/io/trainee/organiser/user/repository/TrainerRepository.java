package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.TrainerEntity;
import io.trainee.organiser.user.request.CreateTrainerRequest;
import io.trainee.organiser.user.request.UpdateTrainerRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = UserUrlConstants.TRAINERS_URL)
public interface TrainerRepository extends JpaRepository<TrainerEntity, UUID> {

    UpdateTrainerRequest save(UpdateTrainerRequest trainerInfo);
    CreateTrainerRequest save(CreateTrainerRequest trainerInfo);
}
