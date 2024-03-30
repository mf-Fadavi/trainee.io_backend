package io.trainee.organiser.user.trainer;

import io.trainee.organiser.user.trainer.dto.CreateTrainer;
import io.trainee.organiser.user.trainer.dto.UpdateTrainer;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/trainer")
@AllArgsConstructor
public class TrainerController {

    private TrainerService trainerService;

    @GetMapping("/list")
    public List<TrainerEntity> findAll() {
        return trainerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TrainerEntity> findOneById(@PathVariable("id")UUID trainerID) {
        return trainerService.findOneById(trainerID);
    }

    @PostMapping("/create")
    public CreateTrainer createOne(@RequestBody() CreateTrainer trainerInfo) {
        return trainerService.createOne(trainerInfo);
    }

    @PutMapping("/update/{id}")
    public UpdateTrainer updateOne(@RequestBody() UpdateTrainer trainerInfo) {
        return trainerService.updateOne(trainerInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathParam("id") UUID trainerId) {
        trainerService.deleteOne(trainerId);
    }
}
