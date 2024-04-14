package io.trainee.organiser.challenge.endpoint;

import io.trainee.organiser.challenge.constant.ChallengeUrlConstant;
import io.trainee.organiser.challenge.request.CreateChallengeRequest;
import io.trainee.organiser.challenge.request.UpdateChallengeRequest;
import io.trainee.organiser.challenge.response.ChallengeView;
import io.trainee.organiser.challenge.service.impl.ChallengeService;
import io.trainee.organiser.company.constant.CompanyUrlConstant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1" + ChallengeUrlConstant.CHALLENGES_ID)
public class ChallengeController {
    private ChallengeService challengeService;

    @GetMapping()
    public List<ChallengeView> findAll() {
        return challengeService.findAll();
    }

    @GetMapping(ChallengeUrlConstant.ENTITY_ID)
    public ChallengeView findById(@PathVariable("id") UUID id) {
        return challengeService.findById(id);
    }

    @PostMapping(ChallengeUrlConstant.CHALLENGE_ID)
    public ChallengeView create(@RequestBody() CreateChallengeRequest challengeDto) {
        return challengeService.create(challengeDto);
    }

    @PutMapping(ChallengeUrlConstant.ENTITY_ID)
    public ChallengeView update(@RequestBody() UpdateChallengeRequest challengeDto) {
        return challengeService.update(challengeDto);
    }

    @DeleteMapping(ChallengeUrlConstant.ENTITY_ID)
    public void delete(@PathVariable("id") UUID id) {
        challengeService.delete(id);
    }
}
