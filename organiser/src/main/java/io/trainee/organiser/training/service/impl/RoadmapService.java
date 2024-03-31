package io.trainee.organiser.training.service.impl;

import io.trainee.organiser.training.entity.RoadmapEntity;
import io.trainee.organiser.training.repository.RoadmapRepository;
import io.trainee.organiser.training.request.CreateRoadmap;
import io.trainee.organiser.training.request.UpdateRoadmap;
import io.trainee.organiser.training.service.IRoadmapService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RoadmapService implements IRoadmapService {

    private RoadmapRepository roadmapRepository;

    @Override
    public List<RoadmapEntity> findAll() {
        return roadmapRepository.findAll();
    }

    @Override
    public Optional<RoadmapEntity> findOneById(UUID roadmapId) {
        return roadmapRepository.findById(roadmapId);
    }

    @Override
    public CreateRoadmap createOne(CreateRoadmap skill) {
        return roadmapRepository.save(skill);
    }

    @Override
    public UpdateRoadmap updateOne(UpdateRoadmap skill) {
        return roadmapRepository.save(skill);
    }

    @Override
    public void deleteOne(UUID roadmapId) {
        roadmapRepository.deleteById(roadmapId);
    }
}
