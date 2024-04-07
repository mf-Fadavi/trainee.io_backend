package io.trainee.organiser.company.service;

import io.trainee.organiser.company.request.CreateStackRequest;
import io.trainee.organiser.company.request.UpdateStackRequest;
import io.trainee.organiser.company.response.StackView;

import java.util.List;
import java.util.UUID;

public interface IStackService {
    public List<StackView> findAll();
    public StackView findById(UUID id);
    public StackView create(CreateStackRequest topicDto);
    public StackView update(UpdateStackRequest topicDto);
    public void delete(UUID id);
}
