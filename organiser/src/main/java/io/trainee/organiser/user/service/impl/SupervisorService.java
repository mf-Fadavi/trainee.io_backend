package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.SupervisorEntity;
import io.trainee.organiser.user.repository.SupervisorRepository;
import io.trainee.organiser.user.request.CreateSupervisorRequest;
import io.trainee.organiser.user.request.UpdateSupervisorRequest;
import io.trainee.organiser.user.service.ISupervisorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SupervisorService implements ISupervisorService {

    private SupervisorRepository supervisorRepository;

    @Override
    public List<SupervisorEntity> findAll() {
        return supervisorRepository.findAll();
    }

    @Override
    public Optional<SupervisorEntity> findOneById(UUID supervisorId) {
        return supervisorRepository.findById(supervisorId);
    }

    @Override
    public CreateSupervisorRequest createOne(CreateSupervisorRequest supervisorInfo) {
        return supervisorRepository.save(supervisorInfo);
    }

    @Override
    public UpdateSupervisorRequest updateOne(UpdateSupervisorRequest supervisorInfo) {
        return supervisorRepository.save(supervisorInfo);
    }

    @Override
    public void deleteOne(UUID supervisorId) {
        supervisorRepository.deleteById(supervisorId);
    }
}
