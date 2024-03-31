package io.trainee.organiser.user.endpoint;

import io.trainee.organiser.user.entity.TraineeEntity;
import io.trainee.organiser.user.service.impl.TraineeService;
import io.trainee.organiser.user.request.CreateTrainee;
import io.trainee.organiser.user.request.UpdateTrainee;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/trainee")
@AllArgsConstructor
public class TraineeController {

    private TraineeService traineeService;

    @GetMapping("/list")
    public List<TraineeEntity> findAll() {
        return traineeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TraineeEntity> findOneById(@PathVariable("id") UUID traineeId) {
        return traineeService.findOneById(traineeId);
    }

    @PostMapping("/create")
    public CreateTrainee createOne(@RequestBody() CreateTrainee traineeInfo) {
        return traineeService.createOne(traineeInfo);
    }

    @PutMapping("/update/{id}")
    public UpdateTrainee updateOne(@RequestBody() UpdateTrainee traineeInfo) {
        return traineeService.updateOne(traineeInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathParam("id") UUID traineeId) {
        traineeService.deleteOne(traineeId);
    }
}
