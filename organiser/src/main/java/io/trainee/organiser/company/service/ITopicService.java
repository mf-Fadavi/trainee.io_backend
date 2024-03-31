package io.trainee.organiser.company.service;

import io.trainee.organiser.company.repository.TopicRepository;

import java.util.UUID;

public interface ITopicService {
    void deleteATopic (UUID id);
}
