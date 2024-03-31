package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.AccountEntity;
import io.trainee.organiser.user.request.CreateAccount;
import io.trainee.organiser.user.request.UpdateAccount;
import io.trainee.organiser.user.repository.AccountRepository;
import io.trainee.organiser.user.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AccountService implements IAccountService {

    private AccountRepository accountRepository;
    @Override
    public List<AccountEntity> findAll() {
        return accountRepository.findAll();
    }
    @Override
    public Optional<AccountEntity> findOneById(UUID accountId) {
        return accountRepository.findById(accountId);
    }
    @Override
    public CreateAccount createOne(CreateAccount accountInfo) {
        return accountRepository.save(accountInfo);
    }
    @Override
    public UpdateAccount updateOne(UpdateAccount accountInfo) {
        return accountRepository.save(accountInfo);
    }
    @Override
    public void deleteOne(UUID accountId) {
        accountRepository.deleteById(accountId);
    }
}
