package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.SupervisorEntity;
import io.trainee.organiser.user.repository.SupervisorRepository;
import io.trainee.organiser.user.request.CreateSupervisor;
import io.trainee.organiser.user.request.UpdateSupervisor;
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
    public List<SupervisorEntity> findAll() {
        return supervisorRepository.findAll();
    }

    public Optional<SupervisorEntity> findOneById(UUID supervisorId) {
        return supervisorRepository.findById(supervisorId);
    }

    public CreateSupervisor createOne(CreateSupervisor supervisorInfo) {
        return supervisorRepository.save(supervisorInfo);
    }

    public UpdateSupervisor updateOne(UpdateSupervisor supervisorInfo) {
        return supervisorRepository.save(supervisorInfo);
    }

    public void deleteOne(UUID supervisorId) {
        supervisorRepository.deleteById(supervisorId);
    }
}
