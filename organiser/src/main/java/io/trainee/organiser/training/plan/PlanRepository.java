package io.trainee.organiser.training.plan;

import io.trainee.organiser.training.plan.dto.UpdatePlan;
import io.trainee.organiser.training.plan.dto.CreatePlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlanRepository extends JpaRepository<PlanEntity, UUID> {
    public UpdatePlan save(UpdatePlan plan);
    public CreatePlan save(CreatePlan plan);
}
