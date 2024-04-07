package io.trainee.organiser.user.request;

import jakarta.validation.constraints.NotNull;

public record CreateRoleRequest(
    @NotNull
    ERoleName name
){
}
