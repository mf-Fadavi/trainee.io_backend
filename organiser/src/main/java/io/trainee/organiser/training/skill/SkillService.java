package io.trainee.organiser.training.skill;

import io.trainee.organiser.training.skill.SkillEntity;
import io.trainee.organiser.training.skill.dto.CreateSkill;
import io.trainee.organiser.training.skill.dto.UpdateSkill;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SkillService {

    private SkillRepository skillRepository;

    public List<SkillEntity> findAll() {
        return skillRepository.findAll();
    }

    public Optional<SkillEntity> findOneById(UUID skillId) {
        return skillRepository.findById(skillId);
    }

    public CreateSkill createOne(CreateSkill skill) {
        return skillRepository.save(skill);
    }

    public UpdateSkill updateOne(UpdateSkill skill) {
        return skillRepository.save(skill);
    }

    public void deleteOne(UUID skillId) {
        skillRepository.deleteById(skillId);
    }
}
