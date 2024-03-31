package io.trainee.organiser.training.repository;

import io.trainee.organiser.training.entity.RoadmapEntity;
import io.trainee.organiser.training.request.CreateRoadmap;
import io.trainee.organiser.training.request.UpdateRoadmap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoadmapRepository extends JpaRepository<RoadmapEntity, UUID> {
    public UpdateRoadmap save(UpdateRoadmap roadmap);
    public CreateRoadmap save(CreateRoadmap roadmap);
}
