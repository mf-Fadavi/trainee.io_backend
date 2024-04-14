package io.trainee.organiser.validator;

import io.trainee.organiser.user.entity.AccountEntity;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
@Slf4j
@Validated
@Component
@RepositoryEventHandler
public class CustomEventHandler {
    @HandleBeforeCreate
    public void onBeforeCreate(@Valid AccountEntity account) {
    }
}
