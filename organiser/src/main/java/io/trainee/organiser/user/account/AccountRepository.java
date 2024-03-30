package io.trainee.organiser.user.account;

import io.trainee.organiser.user.account.dto.CreateAccount;
import io.trainee.organiser.user.account.dto.UpdateAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<AccountEntity, UUID> {
    public UpdateAccount save(UpdateAccount accountInfo);
    public CreateAccount save(CreateAccount accountInfo);
}
