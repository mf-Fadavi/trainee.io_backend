package io.trainee.organiser.user.response;

import java.util.UUID;

public record TrainerView(
        UUID userId,
        String userFirstname,
        String userLastName,
        UUID accountId
) {
}
