package io.trainee.organiser.challenge.repository;

import io.trainee.organiser.challenge.constant.ChallengeUrlConstant;
import io.trainee.organiser.challenge.entity.ChallengeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = ChallengeUrlConstant.CHALLENGES_ID, collectionResourceRel = ChallengeUrlConstant.CHALLENGES_ID)
public interface ChallengeRepository extends JpaRepository<ChallengeEntity, Long> {
}
