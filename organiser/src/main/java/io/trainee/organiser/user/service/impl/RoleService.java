package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.RoleEntity;
import io.trainee.organiser.user.mapper.RoleMapperImpl;
import io.trainee.organiser.user.repository.RoleRepository;
import io.trainee.organiser.user.request.CreateRoleRequest;
import io.trainee.organiser.user.response.RoleView;
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
    private RoleMapperImpl roleMapper;

    @Override
    public List<RoleEntity> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<RoleEntity> findOneById(UUID roleId) {
        return roleRepository.findById(roleId);
    }

    @Override
    public Optional<RoleEntity> findOneByName(String roleName) {
        return roleRepository.findOneByName(roleName);
    }

    @Override
    public RoleView createOne(CreateRoleRequest createRoleDto) {
        var roleEntity = roleMapper.toEntity(createRoleDto);
        roleEntity = roleRepository.save(roleEntity);
        return roleMapper.toDto(roleEntity);
    }


    @Override
    public void deleteOne(UUID roleId) {
        roleRepository.deleteById(roleId);
    }
}
