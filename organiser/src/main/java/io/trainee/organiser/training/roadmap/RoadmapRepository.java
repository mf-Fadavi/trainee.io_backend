package io.trainee.organiser.training.roadmap;

import io.trainee.organiser.training.roadmap.dto.CreateRoadmap;
import io.trainee.organiser.training.roadmap.dto.UpdateRoadmap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoadmapRepository extends JpaRepository<RoadmapEntity, UUID> {
    public UpdateRoadmap save(UpdateRoadmap roadmap);
    public CreateRoadmap save(CreateRoadmap roadmap);
}
