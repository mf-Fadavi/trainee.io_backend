package io.trainee.organiser.company.service.impl;

import io.trainee.organiser.company.repository.TopicRepository;
import io.trainee.organiser.company.request.CreateTopicRequest;
import io.trainee.organiser.company.request.UpdateTopicRequest;
import io.trainee.organiser.company.response.TopicView;
import io.trainee.organiser.company.service.ITopicService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TopicService  implements ITopicService {

    private TopicRepository topicRepository;

    @Override
    public List<TopicView> findAll() {
        return null;
    }

    @Override
    public TopicView findById(UUID id) {
        return null;
    }

    @Override
    public TopicView create(CreateTopicRequest topicDto) {
        return null;
    }

    @Override
    public TopicView update(UpdateTopicRequest topicDto) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
