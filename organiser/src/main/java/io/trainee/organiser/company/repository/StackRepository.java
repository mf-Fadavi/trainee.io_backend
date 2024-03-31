package io.trainee.organiser.company.repository;

import io.trainee.organiser.company.entity.StackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StackRepository extends JpaRepository<StackEntity, UUID> {
}
