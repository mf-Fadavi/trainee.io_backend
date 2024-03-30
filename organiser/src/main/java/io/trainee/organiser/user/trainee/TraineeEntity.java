package io.trainee.organiser.user.trainee;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "trainee", schema = "public")
public class TraineeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
