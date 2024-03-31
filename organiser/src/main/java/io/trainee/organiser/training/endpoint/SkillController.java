package io.trainee.organiser.training.endpoint;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import io.trainee.organiser.training.entity.SkillEntity;
import io.trainee.organiser.training.service.impl.SkillService;
import io.trainee.organiser.training.request.CreateSkill;
import io.trainee.organiser.training.request.UpdateSkill;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class SkillController {

    private SkillService skillService;

    @GetMapping(TrainingUrlConstant.SKILL_URL)
    public List<SkillEntity> findAll() {
        return skillService.findAll();
    }

    @GetMapping(TrainingUrlConstant.SKILL_URL + TrainingUrlConstant.ENTITY_ID)
    public Optional<SkillEntity> findOneById(@PathVariable("id") UUID skillId) {
        return skillService.findOneById(skillId);
    }

    @PostMapping(TrainingUrlConstant.SKILL_URL)
    public CreateSkill createOne(@RequestBody() CreateSkill skill) {
        return skillService.createOne(skill);
    }

    @PutMapping(TrainingUrlConstant.ENTITY_ID)
    public UpdateSkill updateOne(@RequestBody() UpdateSkill skill) {
        return skillService.updateOne(skill);
    }

    @DeleteMapping(TrainingUrlConstant.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID skillId) {
        skillService.deleteOne(skillId);
    }
}
