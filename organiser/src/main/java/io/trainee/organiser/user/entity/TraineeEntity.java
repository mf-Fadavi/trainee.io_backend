package io.trainee.organiser.user.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "trainee", schema = "public")
public class TraineeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
