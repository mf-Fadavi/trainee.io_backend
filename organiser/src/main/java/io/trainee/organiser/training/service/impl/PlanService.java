package io.trainee.organiser.training.service.impl;

import io.trainee.organiser.training.entity.PlanEntity;
import io.trainee.organiser.training.request.CreatePlanRequest;
import io.trainee.organiser.training.request.UpdatePlanRequest;
import io.trainee.organiser.training.repository.PlanRepository;
import io.trainee.organiser.training.service.IPlanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PlanService implements IPlanService {

    private PlanRepository planRepository;

    @Override
    public List<PlanEntity> findAll() {
        return planRepository.findAll();
    }

    @Override
    public Optional<PlanEntity> findOneById(UUID planId) {
        return planRepository.findById(planId);
    }

    @Override
    public CreatePlanRequest createOne(CreatePlanRequest plan) {
        return planRepository.save(plan);
    }

    @Override
    public UpdatePlanRequest updateOne(UpdatePlanRequest plan) {
        return planRepository.save(plan);
    }

    @Override
    public void deleteOne(UUID planId) {
        planRepository.deleteById(planId);
    }
}
