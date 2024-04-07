package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.AccountEntity;
import io.trainee.organiser.user.exception.UserNotFoundException;
import io.trainee.organiser.user.request.CreateAccountRequest;
import io.trainee.organiser.user.request.UpdateAccountRequest;
import io.trainee.organiser.user.response.AccountView;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IAccountService {
    List<AccountView> findAll();

    Optional<AccountEntity> findOneById(UUID accountId) throws UserNotFoundException;

    AccountView createOne(CreateAccountRequest accountInfo);

    AccountView updateOne(UpdateAccountRequest accountInfo);

    void deleteOne(UUID accountId);
}
