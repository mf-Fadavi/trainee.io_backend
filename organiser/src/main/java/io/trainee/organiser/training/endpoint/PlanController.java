package io.trainee.organiser.training.endpoint;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1" + TrainingUrlConstant.PLANS_URL)
public class PlanController {
}
