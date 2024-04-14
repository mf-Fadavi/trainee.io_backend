package io.trainee.organiser.training.repository;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import io.trainee.organiser.training.entity.SkillEntity;
import io.trainee.organiser.training.request.CreateSkillRequest;
import io.trainee.organiser.training.request.UpdateSkillRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = TrainingUrlConstant.SKILLS_URL, collectionResourceRel = TrainingUrlConstant.SKILLS_URL)
public interface SkillRepository extends JpaRepository<SkillEntity, UUID> {
    public UpdateSkillRequest save(UpdateSkillRequest skill);
    public CreateSkillRequest save(CreateSkillRequest skill);
}