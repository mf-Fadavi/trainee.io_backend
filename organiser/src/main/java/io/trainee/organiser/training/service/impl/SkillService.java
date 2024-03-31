package io.trainee.organiser.training.service.impl;

import io.trainee.organiser.training.entity.SkillEntity;
import io.trainee.organiser.training.repository.SkillRepository;
import io.trainee.organiser.training.request.CreateSkill;
import io.trainee.organiser.training.request.UpdateSkill;
import io.trainee.organiser.training.service.ISkillService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SkillService implements ISkillService {

    private SkillRepository skillRepository;

    @Override
    public List<SkillEntity> findAll() {
        return skillRepository.findAll();
    }

    @Override
    public Optional<SkillEntity> findOneById(UUID skillId) {
        return skillRepository.findById(skillId);
    }

    @Override
    public CreateSkill createOne(CreateSkill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public UpdateSkill updateOne(UpdateSkill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public void deleteOne(UUID skillId) {
        skillRepository.deleteById(skillId);
    }
}
