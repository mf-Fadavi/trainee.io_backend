package io.trainee.organiser.assessment.service;

import io.trainee.organiser.assessment.request.CreateAssessmentRequest;
import io.trainee.organiser.assessment.request.UpdateAssessmentRequest;
import io.trainee.organiser.assessment.response.AssessmentView;

import java.util.List;
import java.util.UUID;

public interface IAssessmentService {
    public List<AssessmentView> findAll();
    public AssessmentView findOneById(UUID id);
    public AssessmentView createOne(CreateAssessmentRequest assessmentDto);
    public AssessmentView updateOne(UpdateAssessmentRequest assessmentDto);
    public void deleteOne(UUID id);
}
