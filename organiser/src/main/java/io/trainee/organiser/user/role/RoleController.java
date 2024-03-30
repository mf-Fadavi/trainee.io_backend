package io.trainee.organiser.user.role;

import io.trainee.organiser.user.role.RoleEntity;
import io.trainee.organiser.user.role.dto.CreateRole;
import io.trainee.organiser.user.role.dto.UpdateRole;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/role")
@AllArgsConstructor
public class RoleController {

    private RoleService roleService;
    @GetMapping("/list")
    public List<RoleEntity> findAll() {
        return roleService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<RoleEntity> findOneById(@PathVariable("id") UUID supervisorId) {
        return roleService.findOneById(supervisorId);
    }

    @PostMapping("/create")
    public CreateRole createOne(@RequestBody() CreateRole supervisorInfo) {
        return roleService.createOne(supervisorInfo);
    }

    @PutMapping("/update/{id}")
    public UpdateRole updateOne(@RequestBody() UpdateRole supervisorInfo) {
        return roleService.updateOne(supervisorInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathParam("id") UUID roleId) {
        roleService.deleteOne(roleId);
    }
}
