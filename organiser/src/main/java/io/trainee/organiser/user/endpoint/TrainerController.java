package io.trainee.organiser.user.endpoint;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.request.CreateTrainerRequest;
import io.trainee.organiser.user.request.UpdateTrainerRequest;
import io.trainee.organiser.user.entity.TrainerEntity;
import io.trainee.organiser.user.response.TrainerView;
import io.trainee.organiser.user.service.impl.TrainerService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@AllArgsConstructor
public class TrainerController {

    private TrainerService trainerService;

    @GetMapping()
    public List<TrainerEntity> findAll() {
        return trainerService.findAll();
    }

    @GetMapping(UserUrlConstants.TRAINER_URL)
    public Optional<TrainerEntity> findOneById(@PathVariable("id")UUID trainerID) {
        return  trainerService.findOneById(trainerID);
    }

    @PostMapping(UserUrlConstants.ENTITY_ID)
    public TrainerEntity createOne(@RequestBody() TrainerEntity trainerInfo) {
        return trainerService.createOne(trainerInfo);
    }

    @PutMapping(UserUrlConstants.ENTITY_ID)
    public UpdateTrainerRequest updateOne(@RequestBody() UpdateTrainerRequest trainerInfo) {
        return trainerService.updateOne(trainerInfo);
    }

    @DeleteMapping(UserUrlConstants.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID trainerId) {
        trainerService.deleteOne(trainerId);
    }
}
