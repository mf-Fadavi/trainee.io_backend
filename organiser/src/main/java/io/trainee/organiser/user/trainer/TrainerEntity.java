package io.trainee.organiser.user.trainer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.hateoas.RepresentationModel;

import java.util.UUID;

@Entity
public class TrainerEntity extends RepresentationModel<TrainerEntity>{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String firstName;

    private String lastName;
}
