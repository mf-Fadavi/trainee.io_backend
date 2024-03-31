package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.AdminEntity;
import io.trainee.organiser.user.repository.AdminRepository;
import io.trainee.organiser.user.service.IAdminService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AdminService implements IAdminService {
    private AdminRepository adminRepository;
    @Override
    public List<AdminEntity> findAll() {
        return adminRepository.findAll();
    }

    @Override

    public Optional<AdminEntity> findOneById(UUID adminId) {
        return adminRepository.findById(adminId);
    }

    @Override
    public AdminEntity createOne(AdminEntity adminInfo) {
        return adminRepository.save(adminInfo);
    }

    @Override
    public AdminEntity updateOne(AdminEntity adminInfo) {
        return adminRepository.save(adminInfo);
    }

    @Override
    public void deleteOne(UUID adminId) {
        adminRepository.deleteById(adminId);
    }
}
