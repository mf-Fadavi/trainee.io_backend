package io.trainee.organiser.training.service;

import io.trainee.organiser.training.request.CreateBadgeRequest;
import io.trainee.organiser.training.request.UpdateBadgeRequest;
import io.trainee.organiser.training.response.BadgeView;

import java.util.List;
import java.util.UUID;

public interface IBadgeService {
    List<BadgeView> findAll();
    BadgeView findOneById(UUID id);
    BadgeView createOne(CreateBadgeRequest badgeDto);
    BadgeView updateOne(UpdateBadgeRequest badgeDto);
    void deleteOne(UUID id);
}
