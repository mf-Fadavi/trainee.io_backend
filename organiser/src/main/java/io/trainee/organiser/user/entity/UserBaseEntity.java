package io.trainee.organiser.user.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class UserBaseEntity extends UserBaseAuditEntity{
    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    private String firsName;

    @NotNull
    private String lastName;

    private String alias;

    @OneToOne(optional = false)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private AccountEntity account;
}
