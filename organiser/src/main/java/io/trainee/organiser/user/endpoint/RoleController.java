package io.trainee.organiser.user.endpoint;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.RoleEntity;
import io.trainee.organiser.user.response.RoleView;
import io.trainee.organiser.user.service.impl.RoleService;
import io.trainee.organiser.user.request.CreateRoleRequest;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
public class RoleController {

    private RoleService roleService;
    @GetMapping()
    public List<RoleEntity> findAll() {
        return roleService.findAll();
    }

    @GetMapping(UserUrlConstants.ENTITY_ID)
    public Optional<RoleEntity> findOneById(@PathVariable("id") UUID supervisorId) {
        return roleService.findOneById(supervisorId);
    }

    @PostMapping(UserUrlConstants.ROLE_URL)
    public RoleView createOne(@RequestBody() CreateRoleRequest supervisorInfo) {
        return roleService.createOne(supervisorInfo);
    }


    @DeleteMapping(UserUrlConstants.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID roleId) {
        roleService.deleteOne(roleId);
    }
}
