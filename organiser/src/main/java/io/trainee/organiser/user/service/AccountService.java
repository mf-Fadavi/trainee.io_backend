package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.AccountEntity;
import io.trainee.organiser.user.dto.CreateAccount;
import io.trainee.organiser.user.dto.UpdateAccount;
import io.trainee.organiser.user.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AccountService {

    private AccountRepository accountRepository;
    public List<AccountEntity> findAll() {
        return accountRepository.findAll();
    }

    public Optional<AccountEntity> findOneById(UUID accountId) {
        return accountRepository.findById(accountId);
    }

    public CreateAccount createOne(CreateAccount accountInfo) {
        return accountRepository.save(accountInfo);
    }

    public UpdateAccount updateOne(UpdateAccount accountInfo) {
        return accountRepository.save(accountInfo);
    }

    public void deleteOne(UUID accountId) {
        accountRepository.deleteById(accountId);
    }
}
