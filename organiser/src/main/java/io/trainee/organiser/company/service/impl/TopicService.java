package io.trainee.organiser.company.service.impl;

import io.trainee.organiser.company.repository.TopicRepository;
import io.trainee.organiser.company.service.ITopicService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class TopicService  implements ITopicService {
    private TopicRepository topicRepo;
    @Override
    public void deleteATopic (UUID id) {
        topicRepo.deleteById(id);
    }
}
