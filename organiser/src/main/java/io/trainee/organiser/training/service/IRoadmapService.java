package io.trainee.organiser.training.service;

import io.trainee.organiser.training.entity.RoadmapEntity;
import io.trainee.organiser.training.request.CreateRoadmapRequest;
import io.trainee.organiser.training.request.UpdateRoadmapRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IRoadmapService {
    List<RoadmapEntity> findAll();
    Optional<RoadmapEntity> findOneById(UUID roadmapId);
    CreateRoadmapRequest createOne(CreateRoadmapRequest roadmapDto);
    UpdateRoadmapRequest updateOne(UpdateRoadmapRequest roadmapDto);
    void deleteOne(UUID roadmapId);
}
