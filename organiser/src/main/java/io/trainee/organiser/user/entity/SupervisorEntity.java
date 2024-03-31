package io.trainee.organiser.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class SupervisorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}