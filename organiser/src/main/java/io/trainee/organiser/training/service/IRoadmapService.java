package io.trainee.organiser.training.service;

import io.trainee.organiser.training.entity.RoadmapEntity;
import io.trainee.organiser.training.request.CreateRoadmap;
import io.trainee.organiser.training.request.UpdateRoadmap;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IRoadmapService {
    List<RoadmapEntity> findAll();

    Optional<RoadmapEntity> findOneById(UUID roadmapId);

    CreateRoadmap createOne(CreateRoadmap skill);

    UpdateRoadmap updateOne(UpdateRoadmap skill);

    void deleteOne(UUID roadmapId);
}
