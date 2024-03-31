package io.trainee.organiser.company.repository;

import io.trainee.organiser.company.entity.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TopicRepository extends JpaRepository<TopicEntity, UUID> {
}
