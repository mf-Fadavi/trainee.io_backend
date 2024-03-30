package io.trainee.organiser.training.plan;

import io.trainee.organiser.training.plan.PlanEntity;
import io.trainee.organiser.training.plan.dto.CreatePlan;
import io.trainee.organiser.training.plan.dto.UpdatePlan;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PlanService {

    private PlanRepository planRepository;

    public List<PlanEntity> findAll() {
        return planRepository.findAll();
    }

    public Optional<PlanEntity> findOneById(UUID roadmapId) {
        return planRepository.findById(roadmapId);
    }

    public CreatePlan createOne(CreatePlan roadmap) {
        return planRepository.save(roadmap);
    }

    public UpdatePlan updateOne(UpdatePlan roadmap) {
        return planRepository.save(roadmap);
    }

    public void deleteOne(UUID roadmapId) {
        planRepository.deleteById(roadmapId);
    }
}
