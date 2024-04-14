package io.trainee.organiser.training.endpoint;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import io.trainee.organiser.training.entity.SkillEntity;
import io.trainee.organiser.training.service.impl.SkillService;
import io.trainee.organiser.training.request.CreateSkillRequest;
import io.trainee.organiser.training.request.UpdateSkillRequest;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1" + TrainingUrlConstant.SKILLS_URL)
public class SkillController {

    private SkillService skillService;

    @GetMapping()
    public List<SkillEntity> findAll() {
        return skillService.findAll();
    }

    @GetMapping(TrainingUrlConstant.SKILLS_URL + TrainingUrlConstant.ENTITY_ID)
    public Optional<SkillEntity> findOneById(@PathVariable("id") UUID skillId) {
        return skillService.findOneById(skillId);
    }

    @PostMapping(TrainingUrlConstant.SKILLS_URL)
    public CreateSkillRequest createOne(@RequestBody() CreateSkillRequest skill) {
        return skillService.createOne(skill);
    }

    @PutMapping(TrainingUrlConstant.ENTITY_ID)
    public UpdateSkillRequest updateOne(@RequestBody() UpdateSkillRequest skill) {
        return skillService.updateOne(skill);
    }

    @DeleteMapping(TrainingUrlConstant.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID skillId) {
        skillService.deleteOne(skillId);
    }
}
