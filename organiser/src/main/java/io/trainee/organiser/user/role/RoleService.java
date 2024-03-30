package io.trainee.organiser.user.role;

import io.trainee.organiser.user.role.RoleEntity;
import io.trainee.organiser.user.role.dto.CreateRole;
import io.trainee.organiser.user.role.dto.UpdateRole;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RoleService {
    private RoleRepository roleRepository;
    public List<RoleEntity> findAll() {
        return roleRepository.findAll();
    }

    public Optional<RoleEntity> findOneById(UUID roleId) {
        return roleRepository.findById(roleId);
    }

    public CreateRole createOne(CreateRole role) {
        return roleRepository.save(role);
    }

    public UpdateRole updateOne(UpdateRole role) {
        return roleRepository.save(role);
    }

    public void deleteOne(UUID roleId) {
        roleRepository.deleteById(roleId);
    }
}
