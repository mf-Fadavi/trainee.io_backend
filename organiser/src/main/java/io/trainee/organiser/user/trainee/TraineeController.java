package io.trainee.organiser.user.trainee;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/trainee")
public class TraineeController {

    @GetMapping("/list")

    @GetMapping("/{id}")

    @PostMapping("/create")

    @PutMapping("/update/{id}")

    @DeleteMapping("/{id}")
}
