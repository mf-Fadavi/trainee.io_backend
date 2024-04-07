package io.trainee.organiser.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UsernameValidatorConstraint implements ConstraintValidator<UsernameValidator, Object> {
    boolean valid = true;

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        if(o.toString().length() < 5) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{username.size.short}").addPropertyNode("min").addConstraintViolation();
            valid = false;
        }

        if(o.toString().length() > 20) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{username.size.short}").addPropertyNode("max").addConstraintViolation();
            valid = false;
        }

        if(o.toString().matches(".*[\\W]+.*")) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{username.special.character}").addPropertyNode("special_character").addConstraintViolation();
            valid = false;
        }

        if(o.toString().isBlank()) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{username.empty}").addPropertyNode("empty").addConstraintViolation();
            valid = false;
        }
        return valid;
    }
}
