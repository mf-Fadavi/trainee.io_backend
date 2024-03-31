package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.AccountEntity;
import io.trainee.organiser.user.request.CreateAccount;
import io.trainee.organiser.user.request.UpdateAccount;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IAccountService {
    List<AccountEntity> findAll();

    Optional<AccountEntity> findOneById(UUID accountId);

    CreateAccount createOne(CreateAccount accountInfo);

    UpdateAccount updateOne(UpdateAccount accountInfo);

    void deleteOne(UUID accountId);
}
