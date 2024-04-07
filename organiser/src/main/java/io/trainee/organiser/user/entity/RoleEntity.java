package io.trainee.organiser.user.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "role", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID roleId;

    @Column(unique = true)
    private String name;
}
