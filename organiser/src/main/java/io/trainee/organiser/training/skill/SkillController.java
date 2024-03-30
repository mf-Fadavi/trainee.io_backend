package io.trainee.organiser.training.skill;

import io.trainee.organiser.training.skill.SkillEntity;
import io.trainee.organiser.training.skill.dto.CreateSkill;
import io.trainee.organiser.training.skill.dto.UpdateSkill;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/skill")
@AllArgsConstructor
public class SkillController {

    private SkillService skillService;

    @GetMapping("/list")
    public List<SkillEntity> findAll() {
        return skillService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<SkillEntity> findOneById(@PathVariable("id") UUID skillId) {
        return skillService.findOneById(skillId);
    }

    @PostMapping("/create")
    public CreateSkill createOne(@RequestBody() CreateSkill skill) {
        return skillService.createOne(skill);
    }

    @PutMapping("/update/{id}")
    public UpdateSkill updateOne(@RequestBody() UpdateSkill skill) {
        return skillService.updateOne(skill);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathParam("id") UUID skillId) {
        skillService.deleteOne(skillId);
    }
}
