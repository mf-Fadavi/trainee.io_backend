package io.trainee.organiser.user.endpoint;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.TraineeEntity;
import io.trainee.organiser.user.exception.UserNotFoundException;
import io.trainee.organiser.user.request.CreateTraineeRequest;
import io.trainee.organiser.user.response.TraineeView;
import io.trainee.organiser.user.service.impl.TraineeService;
import io.trainee.organiser.user.request.UpdateTraineeRequest;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
public class TraineeController {

    private TraineeService traineeService;

    @GetMapping()
    public List<TraineeEntity> findAll() {
        return traineeService.findAll();
    }

    @GetMapping(UserUrlConstants.TRAINEE_URL)
    public Optional<TraineeEntity> findOneById(@PathVariable("id") UUID traineeId) {
        return traineeService.findOneById(traineeId);
    }

    @PostMapping(UserUrlConstants.TRAINEE_URL)
    public TraineeView createOne(@RequestBody() CreateTraineeRequest traineeInfo) throws UserNotFoundException {
        return traineeService.createOne(traineeInfo);
    }

    @PutMapping(UserUrlConstants.ENTITY_ID)
    public UpdateTraineeRequest updateOne(@RequestBody() UpdateTraineeRequest traineeInfo, @PathVariable("id") UUID traineeId) {
        return traineeService.updateOne(traineeInfo);
    }

    @DeleteMapping(UserUrlConstants.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID traineeId) {
        traineeService.deleteOne(traineeId);
    }
}
