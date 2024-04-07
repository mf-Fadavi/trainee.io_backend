package io.trainee.organiser.company.service;

import io.trainee.organiser.company.request.CreateTopicRequest;
import io.trainee.organiser.company.request.UpdateTopicRequest;
import io.trainee.organiser.company.response.TopicView;

import java.util.List;
import java.util.UUID;

public interface ITopicService {

    public List<TopicView> findAll();
    public TopicView findById(UUID id);
    public TopicView create(CreateTopicRequest topicDto);
    public TopicView update(UpdateTopicRequest topicDto);
    public void delete(UUID id);
}
