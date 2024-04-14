package io.trainee.organiser.company.repository;

import io.trainee.organiser.company.constant.CompanyUrlConstant;
import io.trainee.organiser.company.entity.StackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = CompanyUrlConstant.STACKS_URL, collectionResourceRel = CompanyUrlConstant.STACKS_URL)
public interface StackRepository extends JpaRepository<StackEntity, UUID> {
}
