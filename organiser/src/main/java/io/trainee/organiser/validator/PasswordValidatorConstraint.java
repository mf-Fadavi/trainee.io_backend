package io.trainee.organiser.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Locale;

public class PasswordValidatorConstraint implements ConstraintValidator<PasswordValidation, Object> {
    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        boolean valid = true;
        if(o.toString().length() < 8) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{password.short}").addPropertyNode("length").addConstraintViolation();
            valid = false;
        }
        if(!o.toString().matches(".*[0-9]+.*")) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{password.regex.digit}").addPropertyNode("digit").addConstraintViolation();
            valid = false;
        }
        if(!o.toString().matches(".*[A-Z]+.*")) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{password.regex.capital.letter}").addPropertyNode("capital").addConstraintViolation();
            valid = false;
        }
        if(!o.toString().matches(".*[a-z]+.*")) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{password.regex.small.letter}").addPropertyNode("small").addConstraintViolation();
            valid = false;
        }
        if(!o.toString().matches(".*[\\W]+.*")) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{password.regex.special.letter}").addPropertyNode("special").addConstraintViolation();
            valid = false;
        }
        if(o.toString().matches(".*[\\s]+.*")) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("{password.regex.white.space}").addPropertyNode("space").addConstraintViolation();
            valid = false;
        }
        return valid;
    }
}
