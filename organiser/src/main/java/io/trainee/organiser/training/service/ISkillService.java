package io.trainee.organiser.training.service;

import io.trainee.organiser.training.entity.SkillEntity;
import io.trainee.organiser.training.request.CreateSkill;
import io.trainee.organiser.training.request.UpdateSkill;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ISkillService {
    List<SkillEntity> findAll() ;

    Optional<SkillEntity> findOneById(UUID skillId);

    CreateSkill createOne(CreateSkill skill);

    UpdateSkill updateOne(UpdateSkill skill);

    void deleteOne(UUID skillId);
}
