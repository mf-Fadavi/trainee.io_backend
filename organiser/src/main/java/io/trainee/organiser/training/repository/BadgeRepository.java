package io.trainee.organiser.training.repository;

import io.trainee.organiser.training.entity.BadgeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadgeRepository extends JpaRepository<BadgeEntity, Long> {
}
