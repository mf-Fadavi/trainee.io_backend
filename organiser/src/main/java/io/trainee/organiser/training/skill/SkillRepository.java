package io.trainee.organiser.training.skill;

import io.trainee.organiser.training.skill.dto.CreateSkill;
import io.trainee.organiser.training.skill.dto.UpdateSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SkillRepository extends JpaRepository<SkillEntity, UUID> {
    public UpdateSkill save(UpdateSkill skill);
    public CreateSkill save(CreateSkill skill);
}