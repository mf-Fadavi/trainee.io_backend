package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.entity.AdminEntity;
import io.trainee.organiser.user.request.CreateAdmin;
import io.trainee.organiser.user.request.UpdateAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdminRepository extends JpaRepository<AdminEntity, UUID> {
    public UpdateAdmin save(UpdateAdmin adminInfo);
    public CreateAdmin save(CreateAdmin adminInfo);
}
