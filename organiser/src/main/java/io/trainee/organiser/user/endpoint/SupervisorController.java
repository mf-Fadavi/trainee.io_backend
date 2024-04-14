package io.trainee.organiser.user.endpoint;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.SupervisorEntity;
import io.trainee.organiser.user.service.impl.SupervisorService;
import io.trainee.organiser.user.request.CreateSupervisorRequest;
import io.trainee.organiser.user.request.UpdateSupervisorRequest;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
public class SupervisorController {

    private SupervisorService supervisorService;

    @GetMapping()
    public List<SupervisorEntity> findAll() {
        return supervisorService.findAll();
    }

    @GetMapping(UserUrlConstants.SUPERVISOR_URL)
    public Optional<SupervisorEntity> findOneById(@PathVariable("id") UUID supervisorId) {
        return supervisorService.findOneById(supervisorId);
    }

    @PostMapping(UserUrlConstants.SUPERVISOR_URL)
    public CreateSupervisorRequest createOne(@RequestBody() CreateSupervisorRequest supervisorInfo) {
        return supervisorService.createOne(supervisorInfo);
    }

    @PutMapping(UserUrlConstants.ENTITY_ID)
    public UpdateSupervisorRequest updateOne(@RequestBody() UpdateSupervisorRequest supervisorInfo) {
        return supervisorService.updateOne(supervisorInfo);
    }

    @DeleteMapping(UserUrlConstants.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID supervisorId) {
        supervisorService.deleteOne(supervisorId);
    }
}
