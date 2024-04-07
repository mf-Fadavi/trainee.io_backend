package io.trainee.organiser.company.service.impl;

import io.trainee.organiser.company.request.CreateStackRequest;
import io.trainee.organiser.company.request.UpdateStackRequest;
import io.trainee.organiser.company.response.StackView;
import io.trainee.organiser.company.service.IStackService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StackService implements IStackService {
    @Override
    public List<StackView> findAll() {
        return null;
    }

    @Override
    public StackView findById(UUID id) {
        return null;
    }

    @Override
    public StackView create(CreateStackRequest topicDto) {
        return null;
    }

    @Override
    public StackView update(UpdateStackRequest topicDto) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
