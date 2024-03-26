package io.trainee.organiser.user.supervisor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/supervisor")
public class SupervisorController {

    @Autowired
    private SupervisorService supervisorService;

    @GetMapping("/list")

    @GetMapping("/{id}")

    @PostMapping("/create")

    @PutMapping("/update/{id}")

    @DeleteMapping("/{id}")
}
