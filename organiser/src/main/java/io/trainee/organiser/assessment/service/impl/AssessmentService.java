package io.trainee.organiser.assessment.service.impl;

import io.trainee.organiser.assessment.request.CreateAssessmentRequest;
import io.trainee.organiser.assessment.request.UpdateAssessmentRequest;
import io.trainee.organiser.assessment.response.AssessmentView;
import io.trainee.organiser.assessment.service.IAssessmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AssessmentService implements IAssessmentService {
    @Override
    public List<AssessmentView> findAll() {
        return null;
    }

    @Override
    public AssessmentView findOneById(UUID id) {
        return null;
    }

    @Override
    public AssessmentView createOne(CreateAssessmentRequest assessmentDto) {
        return null;
    }

    @Override
    public AssessmentView updateOne(UpdateAssessmentRequest assessmentDto) {
        return null;
    }

    @Override
    public void deleteOne(UUID id) {

    }
}
