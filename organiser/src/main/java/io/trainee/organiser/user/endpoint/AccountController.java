package io.trainee.organiser.user.endpoint;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.AccountEntity;
import io.trainee.organiser.user.exception.UserNotFoundException;
import io.trainee.organiser.user.response.AccountView;
import io.trainee.organiser.user.service.impl.AccountService;
import io.trainee.organiser.user.request.CreateAccountRequest;
import io.trainee.organiser.user.request.UpdateAccountRequest;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@BasePathAwareController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
    @GetMapping("/accounts/find_all")
    public List<AccountEntity> findAll() {
        return accountService.findAll();
    }

    @GetMapping()
    public AccountEntity findOneById(@PathVariable("id") UUID accountId) {
        return accountService.findOneById(accountId).get();
    }

    @PostMapping(value = UserUrlConstants.ACCOUNT_URL)
    public ResponseEntity<AccountView> createOne(@Valid @RequestBody() CreateAccountRequest accountInfo) {
        return new ResponseEntity<>(accountService.createOne(accountInfo), HttpStatus.CREATED);
    }

    @PutMapping(value = UserUrlConstants.ENTITY_ID)
    public AccountView updateOne(@RequestBody() UpdateAccountRequest accountInfo) {
        return accountService.updateOne(accountInfo);
    }

    @DeleteMapping(value = UserUrlConstants.ENTITY_ID)
    public void deleteOne(@PathParam("id") UUID accountId) {
        accountService.deleteOne(accountId);
    }
}
