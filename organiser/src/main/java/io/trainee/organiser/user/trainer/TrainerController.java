package io.trainee.organiser.user.trainer;

import io.trainee.organiser.user.trainer.dto.CreateTrainer;
import io.trainee.organiser.user.trainer.dto.UpdateTrainer;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("api/trainer")
@AllArgsConstructor
public class TrainerController {

    private TrainerService trainerService;

    @GetMapping("/list")
    public ResponseEntity<Collection<TrainerEntity>> findAll() {
        var trainers = trainerService.findAll();
        trainers.forEach(trainer -> {
            trainer.add(linkTo(methodOn(TrainerController.class).findOneById(trainer.getId())).withSelfRel());
        });
        Link allTrainersLink = linkTo(methodOn(TrainerController.class).findAll()).withSelfRel();
        return ResponseEntity.ok(CollectionModel.of(trainers, allTrainersLink).getContent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrainerEntity> findOneById(@PathVariable("id")UUID trainerID) {
        return  trainerService.findOneById(trainerID).map(trainer -> {
            trainer.add(linkTo(methodOn((TrainerController.class)).findAll()).withRel("trainer_list"));
            return ResponseEntity.ok(trainer);
        }).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public TrainerEntity createOne(@RequestBody() CreateTrainer trainerInfo) {
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
