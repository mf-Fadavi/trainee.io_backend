package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.request.CreateAccount;
import io.trainee.organiser.user.request.UpdateAccount;
import io.trainee.organiser.user.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<AccountEntity, UUID> {
    UpdateAccount save(UpdateAccount accountInfo);
    CreateAccount save(CreateAccount accountInfo);
}
