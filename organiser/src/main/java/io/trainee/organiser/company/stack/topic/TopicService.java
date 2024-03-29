package io.trainee.organiser.company.stack.topic;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private TopicRepository topicRepo;

    public TopicService(TopicRepository topicRepo) {
        this.topicRepo = topicRepo;
    }

    public void deleteATopic (Long id) {
        topicRepo.deleteById(id);
    }
}
