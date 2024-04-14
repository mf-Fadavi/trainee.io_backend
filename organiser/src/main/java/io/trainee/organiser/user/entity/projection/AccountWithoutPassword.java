package io.trainee.organiser.user.entity.projection;

import io.trainee.organiser.user.entity.AccountEntity;
import io.trainee.organiser.user.entity.RoleEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "accountWithoutPassword", types = {AccountEntity.class})
public interface AccountWithoutPassword {
    String getUserName();
    String getEmail();
    RoleEntity getRole();
}
