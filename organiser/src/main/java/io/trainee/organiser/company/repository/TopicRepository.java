package io.trainee.organiser.company.repository;

import io.trainee.organiser.company.constant.CompanyUrlConstant;
import io.trainee.organiser.company.entity.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = CompanyUrlConstant.TOPICS_URL, collectionResourceRel = CompanyUrlConstant.TOPICS_URL)
public interface TopicRepository extends JpaRepository<TopicEntity, UUID> {
}
