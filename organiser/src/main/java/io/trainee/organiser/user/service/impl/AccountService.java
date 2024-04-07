package io.trainee.organiser.user.service.impl;

import io.trainee.organiser.user.entity.AccountEntity;
import io.trainee.organiser.user.exception.UserNotFoundException;
import io.trainee.organiser.user.mapper.AccountMapperImpl;
import io.trainee.organiser.user.repository.RoleRepository;
import io.trainee.organiser.user.response.AccountView;
import io.trainee.organiser.user.request.CreateAccountRequest;
import io.trainee.organiser.user.request.UpdateAccountRequest;
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
    private AccountMapperImpl accountMapper;
    private RoleService roleService;

    @Override
    public List<AccountView> findAll() {
        return accountMapper.toDto(accountRepository.findAll());
    }
    @Override
    public Optional<AccountEntity> findOneById(UUID accountId) throws UserNotFoundException {
        return accountRepository.findById(accountId);
    }
    @Override
    public AccountView createOne(CreateAccountRequest createAccountDto) {
       var role = roleService.findOneByName(createAccountDto.role()).get();
       var entity = accountMapper.toEntity(createAccountDto);
        entity.setRole(role);
        var accountEntity = accountRepository.save(entity);
        return accountMapper.toDto(accountEntity);
    }
    @Override
    public AccountView updateOne(UpdateAccountRequest accountInfo) {
        return accountRepository.save(accountInfo);
    }
    @Override
    public void deleteOne(UUID accountId) {
        accountRepository.deleteById(accountId);
    }
}
