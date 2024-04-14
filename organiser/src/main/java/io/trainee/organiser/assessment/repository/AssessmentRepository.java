package io.trainee.organiser.assessment.repository;

import io.trainee.organiser.assessment.constant.AssessmentUrlConstant;
import io.trainee.organiser.assessment.entity.AssessmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = AssessmentUrlConstant.ASSESSMENTS_URL, collectionResourceRel = AssessmentUrlConstant.ASSESSMENTS_URL)
public interface AssessmentRepository extends JpaRepository<AssessmentEntity, UUID> {
}
