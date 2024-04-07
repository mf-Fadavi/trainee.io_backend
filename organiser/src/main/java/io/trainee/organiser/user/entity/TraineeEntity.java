package io.trainee.organiser.user.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "trainee", schema = "public")
public class TraineeEntity extends  UserBaseEntity{
}
