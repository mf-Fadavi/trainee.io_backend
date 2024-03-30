package io.trainee.organiser.user.supervisor;

import io.trainee.organiser.user.supervisor.SupervisorEntity;
import io.trainee.organiser.user.supervisor.dto.CreateSupervisor;
import io.trainee.organiser.user.supervisor.dto.UpdateSupervisor;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/supervisor")
@AllArgsConstructor
public class SupervisorController {

    private SupervisorService supervisorService;

    @GetMapping("/list")
    public List<SupervisorEntity> findAll() {
        return supervisorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<SupervisorEntity> findOneById(@PathVariable("id") UUID supervisorId) {
        return supervisorService.findOneById(supervisorId);
    }

    @PostMapping("/create")
    public CreateSupervisor createOne(@RequestBody() CreateSupervisor supervisorInfo) {
        return supervisorService.createOne(supervisorInfo);
    }

    @PutMapping("/update/{id}")
    public UpdateSupervisor updateOne(@RequestBody() UpdateSupervisor supervisorInfo) {
        return supervisorService.updateOne(supervisorInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathParam("id") UUID supervisorId) {
        supervisorService.deleteOne(supervisorId);
    }
}
