package io.trainee.organiser.user.response;

import java.util.UUID;

public record TraineeView(
        UUID userId,
        String userFirstName,
        String userLastName,
        UUID accountId
) {
}
