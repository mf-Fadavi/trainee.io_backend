package io.trainee.organiser.training.service;

import io.trainee.organiser.training.entity.SkillEntity;
import io.trainee.organiser.training.request.CreateSkillRequest;
import io.trainee.organiser.training.request.UpdateSkillRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ISkillService {
    List<SkillEntity> findAll() ;
    Optional<SkillEntity> findOneById(UUID skillId);
    CreateSkillRequest createOne(CreateSkillRequest skillDto);
    UpdateSkillRequest updateOne(UpdateSkillRequest skillDto);
    void deleteOne(UUID skillId);
}
