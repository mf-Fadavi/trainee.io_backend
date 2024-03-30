package io.trainee.organiser.training.roadmap;

import io.trainee.organiser.training.roadmap.RoadmapEntity;
import io.trainee.organiser.training.roadmap.dto.CreateRoadmap;
import io.trainee.organiser.training.roadmap.dto.UpdateRoadmap;
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

    @GetMapping("/list")
    public List<RoadmapEntity> findAll() {
        return roadmapService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<RoadmapEntity> findOneById(@PathVariable("id") UUID roadmapId) {
        return roadmapService.findOneById(roadmapId);
    }

    @PostMapping("/create")
    public CreateRoadmap createOne(@RequestBody() CreateRoadmap skill) {
        return roadmapService.createOne(skill);
    }

    @PutMapping("/update/{id}")
    public UpdateRoadmap updateOne(@RequestBody() UpdateRoadmap skill) {
        return roadmapService.updateOne(skill);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathParam("id") UUID roadmapId) {
        roadmapService.deleteOne(roadmapId);
    }
}
