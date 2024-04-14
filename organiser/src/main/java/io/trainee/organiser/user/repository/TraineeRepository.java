package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.TraineeEntity;
import io.trainee.organiser.user.request.UpdateTraineeRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(path = UserUrlConstants.TRAINEES_URL)
public interface TraineeRepository extends JpaRepository<TraineeEntity, UUID> {
    UpdateTraineeRequest save(UpdateTraineeRequest traineeInfo);
}
