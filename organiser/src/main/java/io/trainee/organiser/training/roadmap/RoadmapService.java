package io.trainee.organiser.training.roadmap;

import io.trainee.organiser.training.roadmap.RoadmapEntity;
import io.trainee.organiser.training.roadmap.dto.CreateRoadmap;
import io.trainee.organiser.training.roadmap.dto.UpdateRoadmap;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RoadmapService {

    private RoadmapRepository roadmapRepository;

    public List<RoadmapEntity> findAll() {
        return roadmapRepository.findAll();
    }

    public Optional<RoadmapEntity> findOneById(UUID roadmapId) {
        return roadmapRepository.findById(roadmapId);
    }

    public CreateRoadmap createOne(CreateRoadmap skill) {
        return roadmapRepository.save(skill);
    }

    public UpdateRoadmap updateOne(UpdateRoadmap skill) {
        return roadmapRepository.save(skill);
    }

    public void deleteOne(UUID roadmapId) {
        roadmapRepository.deleteById(roadmapId);
    }
}
