package io.trainee.organiser.user.endpoint;

import io.trainee.organiser.user.constant.UserConstants;
import io.trainee.organiser.user.entity.AdminEntity;
import io.trainee.organiser.user.service.impl.AdminService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class AdminController {
    private AdminService adminService;

    @GetMapping(UserConstants.ADMIN_URL)
    public List<AdminEntity> findAll() {
        return adminService.findAll();
    }

    @GetMapping(UserConstants.ADMIN_URL + UserConstants.ADMIN_ID)
    public Optional<AdminEntity> findOneById(@PathVariable("id") UUID adminId) {
        return adminService.findOneById(adminId);
    }

    @PostMapping(UserConstants.ADMIN_URL)
    public AdminEntity createOne(@RequestBody() AdminEntity adminInfo) {
        return adminService.createOne(adminInfo);
    }

    @PutMapping("/admins/{id}")
    public AdminEntity updateOne(@RequestBody() AdminEntity adminInfo) {
        return adminService.updateOne(adminInfo);
    }

    @DeleteMapping("/admins/{id}")
    public void deleteOne(@PathParam("id") UUID adminId) {
        adminService.deleteOne(adminId);
    }
}
