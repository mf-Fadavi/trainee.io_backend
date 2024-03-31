package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.RoleEntity;
import io.trainee.organiser.user.repository.RoleRepository;
import io.trainee.organiser.user.request.CreateRole;
import io.trainee.organiser.user.request.UpdateRole;
import io.trainee.organiser.user.service.IRoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RoleService implements IRoleService {
    private RoleRepository roleRepository;

    @Override
    public List<RoleEntity> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<RoleEntity> findOneById(UUID roleId) {
        return roleRepository.findById(roleId);
    }

    @Override
    public CreateRole createOne(CreateRole role) {
        return roleRepository.save(role);
    }

    @Override
    public UpdateRole updateOne(UpdateRole role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteOne(UUID roleId) {
        roleRepository.deleteById(roleId);
    }
}
