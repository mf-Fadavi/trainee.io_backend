package io.trainee.organiser.user.request;

import io.trainee.organiser.validator.EnumValidatorString;
import io.trainee.organiser.validator.PasswordValidation;
import io.trainee.organiser.validator.UsernameValidator;
import jakarta.validation.constraints.*;

public record CreateAccountRequest(
        @NotNull(message = "{username.null}")
        @UsernameValidator
        String userName,

        @NotNull(message = "{password.null}")
        @PasswordValidation
        String password,

        @NotNull(message = "{email.null}")
        @Email(message = "{email.invalid}")
        String email,

        @NotNull(message = "{role.not.null}")
        @EnumValidatorString(enumClass = ERoleName.class, message = "{role.not.valid}")
        String role
) { }
