package io.trainee.organiser.training.endpoint;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import io.trainee.organiser.training.entity.RoadmapEntity;
import io.trainee.organiser.training.service.impl.RoadmapService;
import io.trainee.organiser.training.request.CreateRoadmap;
import io.trainee.organiser.training.request.UpdateRoadmap;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/roadmap")
@AllArgsConstructor
public class RoadmapController {

    private RoadmapService roadmapService;

    @GetMapping(TrainingUrlConstant.ROADMAP_URL)
    public List<RoadmapEntity> findAll() {
        return roadmapService.findAll();
    }

    @GetMapping(TrainingUrlConstant.ROADMAP_URL + TrainingUrlConstant.ENTITY_ID)
    public Optional<RoadmapEntity> findOneById(@PathVariable("id") UUID roadmapId) {
        return roadmapService.findOneById(roadmapId);
    }

    @PostMapping(TrainingUrlConstant.ROADMAP_URL)
    public CreateRoadmap createOne(@RequestBody() CreateRoadmap skill) {
        return roadmapService.createOne(skill);
    }

    @PutMapping(TrainingUrlConstant.ENTITY_ID)
    public UpdateRoadmap updateOne(@RequestBody() UpdateRoadmap skill) {
        return roadmapService.updateOne(skill);
    }

    @DeleteMapping(TrainingUrlConstant.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID roadmapId) {
        roadmapService.deleteOne(roadmapId);
    }
}
