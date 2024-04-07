package io.trainee.organiser.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;
import org.springframework.validation.annotation.Validated;

import java.lang.annotation.*;



@Documented
@Constraint(validatedBy = PasswordValidatorConstraint.class)
@Target({ElementType.FIELD, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordValidation {
    String message() default "{password.invalid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
