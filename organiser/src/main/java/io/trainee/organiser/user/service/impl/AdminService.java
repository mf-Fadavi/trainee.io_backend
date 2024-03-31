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

    public List<AdminEntity> findAll() {
        return adminRepository.findAll();
    }

    public Optional<AdminEntity> findOneById(UUID adminId) {
        return adminRepository.findById(adminId);
    }

    public AdminEntity createOne(AdminEntity adminInfo) {
        return adminRepository.save(adminInfo);
    }

    public AdminEntity updateOne(AdminEntity adminInfo) {
        return adminRepository.save(adminInfo);
    }

    public void deleteOne(UUID adminId) {
        adminRepository.deleteById(adminId);
    }
}
