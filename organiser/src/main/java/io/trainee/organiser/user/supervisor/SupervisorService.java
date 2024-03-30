package io.trainee.organiser.user.supervisor;

import io.trainee.organiser.user.supervisor.SupervisorEntity;
import io.trainee.organiser.user.supervisor.dto.CreateSupervisor;
import io.trainee.organiser.user.supervisor.dto.UpdateSupervisor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SupervisorService {

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
