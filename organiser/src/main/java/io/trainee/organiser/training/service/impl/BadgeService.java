package io.trainee.organiser.training.service.impl;

import io.trainee.organiser.training.repository.BadgeRepository;
import io.trainee.organiser.training.request.CreateBadgeRequest;
import io.trainee.organiser.training.request.UpdateBadgeRequest;
import io.trainee.organiser.training.response.BadgeView;
import io.trainee.organiser.training.service.IBadgeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BadgeService implements IBadgeService {

    private BadgeRepository badgeRepository;

    @Override
    public List<BadgeView> findAll() {
        return null;
    }

    @Override
    public BadgeView findOneById(UUID id) {
        return null;
    }

    @Override
    public BadgeView createOne(CreateBadgeRequest badgeDto) {
        return null;
    }

    @Override
    public BadgeView updateOne(UpdateBadgeRequest badgeDto) {
        return null;
    }

    @Override
    public void deleteOne(UUID id) {

    }
}
