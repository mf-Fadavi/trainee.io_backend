package io.trainee.organiser.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UsernameValidatorConstraint.class)
@Target({ElementType.FIELD, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface UsernameValidator {
    String message() default "{user.name.invalid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
