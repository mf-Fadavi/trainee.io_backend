package io.trainee.organiser.challenge.service;

import io.trainee.organiser.challenge.request.CreateChallengeRequest;
import io.trainee.organiser.challenge.request.UpdateChallengeRequest;
import io.trainee.organiser.challenge.response.ChallengeView;

import java.util.List;
import java.util.UUID;

public interface IChallengeService {
    public List<ChallengeView> findAll();
    public ChallengeView findById(UUID id);
    public ChallengeView create(CreateChallengeRequest challengeDto);
    public ChallengeView update(UpdateChallengeRequest challengeDto);
    public void delete(UUID id);
}
