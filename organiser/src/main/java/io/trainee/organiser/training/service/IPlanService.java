package io.trainee.organiser.training.service;

import io.trainee.organiser.training.entity.PlanEntity;
import io.trainee.organiser.training.request.CreatePlanRequest;
import io.trainee.organiser.training.request.UpdatePlanRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface IPlanService {

    List<PlanEntity> findAll();
     Optional<PlanEntity> findOneById(UUID planId);
     CreatePlanRequest createOne(CreatePlanRequest planDto);
     UpdatePlanRequest updateOne(UpdatePlanRequest planDto);
     void deleteOne(UUID planId);
}
