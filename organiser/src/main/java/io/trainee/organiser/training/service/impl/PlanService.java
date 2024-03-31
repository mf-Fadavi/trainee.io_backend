package io.trainee.organiser.training.service.impl;

import io.trainee.organiser.training.entity.PlanEntity;
import io.trainee.organiser.training.request.CreatePlan;
import io.trainee.organiser.training.request.UpdatePlan;
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
    public Optional<PlanEntity> findOneById(UUID roadmapId) {
        return planRepository.findById(roadmapId);
    }

    @Override
    public CreatePlan createOne(CreatePlan roadmap) {
        return planRepository.save(roadmap);
    }

    @Override
    public UpdatePlan updateOne(UpdatePlan roadmap) {
        return planRepository.save(roadmap);
    }

    @Override
    public void deleteOne(UUID roadmapId) {
        planRepository.deleteById(roadmapId);
    }
}
