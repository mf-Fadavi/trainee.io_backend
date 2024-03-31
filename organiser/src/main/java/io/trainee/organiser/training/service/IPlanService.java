package io.trainee.organiser.training.service;

import io.trainee.organiser.training.entity.PlanEntity;
import io.trainee.organiser.training.request.CreatePlan;
import io.trainee.organiser.training.request.UpdatePlan;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface IPlanService {

    List<PlanEntity> findAll();

     Optional<PlanEntity> findOneById(UUID roadmapId);

     CreatePlan createOne(CreatePlan roadmap);

     UpdatePlan updateOne(UpdatePlan roadmap);

     void deleteOne(UUID roadmapId);
}
