package io.trainee.organiser.training.repository;

import io.trainee.organiser.training.entity.PlanEntity;
import io.trainee.organiser.training.request.UpdatePlan;
import io.trainee.organiser.training.request.CreatePlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlanRepository extends JpaRepository<PlanEntity, UUID> {
    public UpdatePlan save(UpdatePlan plan);
    public CreatePlan save(CreatePlan plan);
}
