package io.trainee.organiser.user.admin;

import io.trainee.organiser.user.admin.dto.CreateAdmin;
import io.trainee.organiser.user.admin.dto.UpdateAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdminRepository extends JpaRepository<AdminEntity, UUID> {
    public UpdateAdmin save(UpdateAdmin adminInfo);
    public CreateAdmin save(CreateAdmin adminInfo);
}
