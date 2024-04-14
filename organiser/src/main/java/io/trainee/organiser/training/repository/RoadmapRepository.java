package io.trainee.organiser.training.repository;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import io.trainee.organiser.training.entity.RoadmapEntity;
import io.trainee.organiser.training.request.CreateRoadmapRequest;
import io.trainee.organiser.training.request.UpdateRoadmapRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = TrainingUrlConstant.ROADMAPS_URL, collectionResourceRel = TrainingUrlConstant.ROADMAPS_URL)
public interface RoadmapRepository extends JpaRepository<RoadmapEntity, UUID> {
    public UpdateRoadmapRequest save(UpdateRoadmapRequest roadmap);
    public CreateRoadmapRequest save(CreateRoadmapRequest roadmap);
}
