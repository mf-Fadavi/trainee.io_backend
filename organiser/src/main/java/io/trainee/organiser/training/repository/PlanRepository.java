package io.trainee.organiser.training.repository;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import io.trainee.organiser.training.entity.PlanEntity;
import io.trainee.organiser.training.request.UpdatePlanRequest;
import io.trainee.organiser.training.request.CreatePlanRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = TrainingUrlConstant.PLANS_URL, collectionResourceRel = TrainingUrlConstant.PLANS_URL)
public interface PlanRepository extends JpaRepository<PlanEntity, UUID> {
    public UpdatePlanRequest save(UpdatePlanRequest plan);
    public CreatePlanRequest save(CreatePlanRequest plan);
}
