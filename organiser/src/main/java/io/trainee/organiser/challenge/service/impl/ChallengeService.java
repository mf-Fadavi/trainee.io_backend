package io.trainee.organiser.challenge.service.impl;

import io.trainee.organiser.challenge.repository.ChallengeRepository;
import io.trainee.organiser.challenge.request.CreateChallengeRequest;
import io.trainee.organiser.challenge.request.UpdateChallengeRequest;
import io.trainee.organiser.challenge.response.ChallengeView;
import io.trainee.organiser.challenge.service.IChallengeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@AllArgsConstructor
@Service
public class ChallengeService implements IChallengeService {

    private ChallengeRepository challengeRepository;

    @Override
    public List<ChallengeView> findAll() {
        return null;
    }

    @Override
    public ChallengeView findById(UUID id) {
        return null;
    }

    @Override
    public ChallengeView create(CreateChallengeRequest challengeDto) {
        return null;
    }

    @Override
    public ChallengeView update(UpdateChallengeRequest challengeDto) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
