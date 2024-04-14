package io.trainee.organiser.assessment.endpoint;

import io.trainee.organiser.assessment.constant.AssessmentUrlConstant;
import io.trainee.organiser.assessment.request.CreateAssessmentRequest;
import io.trainee.organiser.assessment.request.UpdateAssessmentRequest;
import io.trainee.organiser.assessment.response.AssessmentView;
import io.trainee.organiser.assessment.service.impl.AssessmentService;
import io.trainee.organiser.challenge.constant.ChallengeUrlConstant;
import io.trainee.organiser.challenge.request.CreateChallengeRequest;
import io.trainee.organiser.challenge.request.UpdateChallengeRequest;
import io.trainee.organiser.assessment.response.AssessmentView;
import io.trainee.organiser.challenge.service.impl.ChallengeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1" + AssessmentUrlConstant.ASSESSMENTS_URL)
public class AssessmentController {
    private AssessmentService assessmentService;

    @GetMapping()
    public List<AssessmentView> findAll() {
        return assessmentService.findAll();
    }

    @GetMapping(ChallengeUrlConstant.ENTITY_ID)
    public AssessmentView findById(@PathVariable("id") UUID id) {
        return assessmentService.findOneById(id);
    }

    @PostMapping(ChallengeUrlConstant.CHALLENGE_ID)
    public AssessmentView create(@RequestBody() CreateAssessmentRequest assessmentDto) {
        return assessmentService.createOne(assessmentDto);
    }

    @PutMapping(ChallengeUrlConstant.ENTITY_ID)
    public AssessmentView update(@RequestBody() UpdateAssessmentRequest assessmentDto) {
        return assessmentService.updateOne(assessmentDto);
    }

    @DeleteMapping(ChallengeUrlConstant.ENTITY_ID)
    public void delete(@PathVariable("id") UUID id) {
        assessmentService.deleteOne(id);
    }
}
