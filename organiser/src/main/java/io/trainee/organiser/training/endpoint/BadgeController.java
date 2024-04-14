package io.trainee.organiser.training.endpoint;

import io.trainee.organiser.training.constant.TrainingUrlConstant;
import io.trainee.organiser.training.entity.SkillEntity;
import io.trainee.organiser.training.request.CreateBadgeRequest;
import io.trainee.organiser.training.request.UpdateBadgeRequest;
import io.trainee.organiser.training.request.UpdateSkillRequest;
import io.trainee.organiser.training.response.BadgeView;
import io.trainee.organiser.training.service.impl.BadgeService;
import io.trainee.organiser.training.service.impl.SkillService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1" + TrainingUrlConstant.BADGES_URL)
public class BadgeController {
    private BadgeService badgeService;

    @GetMapping()
    public List<BadgeView> findAll() {
        return badgeService.findAll();
    }

    @GetMapping(TrainingUrlConstant.ENTITY_ID)
    public BadgeView findOneById(@PathVariable("id") UUID badgeId) {
        return badgeService.findOneById(badgeId);
    }

    @PostMapping(TrainingUrlConstant.SKILLS_URL)
    public BadgeView createOne(@RequestBody() CreateBadgeRequest badgeDto) {
        return badgeService.createOne(badgeDto);
    }

    @PutMapping(TrainingUrlConstant.ENTITY_ID)
    public BadgeView updateOne(@RequestBody() UpdateBadgeRequest badgeDto) {
        return badgeService.updateOne(badgeDto);
    }

    @DeleteMapping(TrainingUrlConstant.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID badgeId) {
        badgeService.deleteOne(badgeId);
    }
}
