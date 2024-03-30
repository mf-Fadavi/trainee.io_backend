package io.trainee.organiser.user.admin;

import io.trainee.organiser.user.admin.AdminEntity;
import io.trainee.organiser.user.admin.dto.CreateAdmin;
import io.trainee.organiser.user.admin.dto.UpdateAdmin;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/admin")
@AllArgsConstructor
public class AdminController {
    private AdminService adminService;

    @GetMapping("/list")
    public List<AdminEntity> findAll() {
        return adminService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AdminEntity> findOneById(@PathVariable("id") UUID adminId) {
        return adminService.findOneById(adminId);
    }

    @PostMapping("/create")
    public CreateAdmin createOne(@RequestBody() CreateAdmin adminInfo) {
        return adminService.createOne(adminInfo);
    }

    @PutMapping("/update/{id}")
    public UpdateAdmin updateOne(@RequestBody() UpdateAdmin adminInfo) {
        return adminService.updateOne(adminInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathParam("id") UUID adminId) {
        adminService.deleteOne(adminId);
    }
}
