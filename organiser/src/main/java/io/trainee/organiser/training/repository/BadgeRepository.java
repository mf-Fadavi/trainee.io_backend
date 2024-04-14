package io.trainee.organiser.training.repository;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import io.trainee.organiser.training.entity.BadgeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = TrainingUrlConstant.BADGES_URL, collectionResourceRel = TrainingUrlConstant.BADGES_URL)
public interface BadgeRepository extends JpaRepository<BadgeEntity, Long> {
}
