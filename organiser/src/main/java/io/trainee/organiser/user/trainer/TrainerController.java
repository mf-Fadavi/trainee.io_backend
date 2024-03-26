package io.trainee.organiser.user.trainer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/trainer")
public class TrainerController {
    @GetMapping("/list")

    @GetMapping("/{id}")

    @PostMapping("/create")

    @PutMapping("/update/{id}")

    @DeleteMapping("/{id}")
}
