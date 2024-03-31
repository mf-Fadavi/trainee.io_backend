package io.trainee.organiser.training.repository;

import io.trainee.organiser.training.entity.SkillEntity;
import io.trainee.organiser.training.request.CreateSkill;
import io.trainee.organiser.training.request.UpdateSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SkillRepository extends JpaRepository<SkillEntity, UUID> {
    public UpdateSkill save(UpdateSkill skill);
    public CreateSkill save(CreateSkill skill);
}