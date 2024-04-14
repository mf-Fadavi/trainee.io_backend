package io.trainee.organiser.training.endpoint;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import io.trainee.organiser.training.entity.RoadmapEntity;
import io.trainee.organiser.training.service.impl.RoadmapService;
import io.trainee.organiser.training.request.CreateRoadmapRequest;
import io.trainee.organiser.training.request.UpdateRoadmapRequest;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/" + TrainingUrlConstant.ROADMAPS_URL)
@AllArgsConstructor
public class RoadmapController {

    private RoadmapService roadmapService;

    @GetMapping(TrainingUrlConstant.ROADMAPS_URL)
    public List<RoadmapEntity> findAll() {
        return roadmapService.findAll();
    }

    @GetMapping(TrainingUrlConstant.ENTITY_ID)
    public Optional<RoadmapEntity> findOneById(@PathVariable("id") UUID roadmapId) {
        return roadmapService.findOneById(roadmapId);
    }

    @PostMapping(TrainingUrlConstant.ENTITY_ID)
    public CreateRoadmapRequest createOne(@RequestBody() CreateRoadmapRequest skill) {
        return roadmapService.createOne(skill);
    }

    @PutMapping(TrainingUrlConstant.ENTITY_ID)
    public UpdateRoadmapRequest updateOne(@RequestBody() UpdateRoadmapRequest skill) {
        return roadmapService.updateOne(skill);
    }

    @DeleteMapping(TrainingUrlConstant.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID roadmapId) {
        roadmapService.deleteOne(roadmapId);
    }
}
