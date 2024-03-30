package io.trainee.organiser.user.admin;

import io.trainee.organiser.user.admin.AdminEntity;
import io.trainee.organiser.user.admin.dto.CreateAdmin;
import io.trainee.organiser.user.admin.dto.UpdateAdmin;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AdminService {
    private AdminRepository adminRepository;

    public List<AdminEntity> findAll() {
        return adminRepository.findAll();
    }

    public Optional<AdminEntity> findOneById(UUID adminId) {
        return adminRepository.findById(adminId);
    }

    public CreateAdmin createOne(CreateAdmin adminInfo) {
        return adminRepository.save(adminInfo);
    }

    public UpdateAdmin updateOne(UpdateAdmin adminInfo) {
        return adminRepository.save(adminInfo);
    }

    public void deleteOne(UUID adminId) {
        adminRepository.deleteById(adminId);
    }
}
