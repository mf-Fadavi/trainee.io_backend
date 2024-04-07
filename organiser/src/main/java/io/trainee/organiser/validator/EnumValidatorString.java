package io.trainee.organiser.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EnumValidatorConstraint.class)
@Target({ElementType.FIELD, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@NotNull
public @interface EnumValidatorString {

    Class<? extends Enum<?>> enumClass();
    String message() default "";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
