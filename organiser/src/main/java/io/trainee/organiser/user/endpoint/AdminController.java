package io.trainee.organiser.user.endpoint;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.AdminEntity;
import io.trainee.organiser.user.service.impl.AdminService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
public class AdminController {
    private AdminService adminService;

    @GetMapping()
    public List<AdminEntity> findAll() {
        return adminService.findAll();
    }

    @GetMapping(UserUrlConstants.ADMIN_URL)
    public Optional<AdminEntity> findOneById(@PathVariable("id") UUID adminId) {
        return adminService.findOneById(adminId);
    }

    @PostMapping(UserUrlConstants.ENTITY_ID)
    public AdminEntity createOne(@RequestBody() AdminEntity adminInfo) {
        return adminService.createOne(adminInfo);
    }

    @PutMapping(UserUrlConstants.ENTITY_ID)
    public AdminEntity updateOne(@RequestBody() AdminEntity adminInfo) {
        return adminService.updateOne(adminInfo);
    }

    @DeleteMapping(UserUrlConstants.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID adminId) {
        adminService.deleteOne(adminId);
    }
}
