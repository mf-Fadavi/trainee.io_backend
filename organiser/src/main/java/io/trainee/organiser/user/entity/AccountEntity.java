package io.trainee.organiser.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.validator.PasswordValidation;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.UUID;

@Data
@Entity
@Table(name = "account", uniqueConstraints = @UniqueConstraint(columnNames = {"user_name"}))
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "test")
    private String userName;

    @JsonIgnore
    @PasswordValidation
    private String password;

    @Email
    @Column(unique = true)
    private String email;

    @RestResource(path = "account_role", rel = "account_role")
    @ManyToOne(optional = false)
    @JoinColumn(name = "roleId", nullable = false)
    private RoleEntity role;
}
