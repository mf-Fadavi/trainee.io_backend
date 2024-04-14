package io.trainee.organiser.company.endpoint;

import io.trainee.organiser.company.constant.CompanyUrlConstant;
import io.trainee.organiser.company.request.CreateTopicRequest;
import io.trainee.organiser.company.request.UpdateTopicRequest;
import io.trainee.organiser.company.response.TopicView;
import io.trainee.organiser.company.service.impl.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1" + CompanyUrlConstant.TOPICS_URL)
public class TopicController {

    private TopicService topicService;

    @GetMapping()
    public List<TopicView> findAll() {
        return topicService.findAll();
    }

    @GetMapping(CompanyUrlConstant.ENTITY_ID)
    public TopicView findById(@PathVariable("id")UUID id) {
        return topicService.findById(id);
    }

    @PostMapping(CompanyUrlConstant.TOPIC_URL)
    public TopicView create(@RequestBody() CreateTopicRequest topicDto) {
        return topicService.create(topicDto);
    }

    @PutMapping(CompanyUrlConstant.ENTITY_ID)
    public TopicView update(@RequestBody() UpdateTopicRequest topicDto) {
        return topicService.update(topicDto);
    }

    @DeleteMapping(CompanyUrlConstant.ENTITY_ID)
    public void delete(@PathVariable("id") UUID id) {
        topicService.delete(id);
    }
}
