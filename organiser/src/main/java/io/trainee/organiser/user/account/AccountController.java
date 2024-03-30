package io.trainee.organiser.user.account;

import io.trainee.organiser.user.account.AccountEntity;
import io.trainee.organiser.user.account.dto.CreateAccount;
import io.trainee.organiser.user.account.dto.UpdateAccount;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/account")
@AllArgsConstructor
public class AccountController {

    private AccountService accountService;
    @GetMapping("/list")
    public List<AccountEntity> findAll() {
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AccountEntity> findOneById(@PathVariable("id") UUID accountId) {
        return accountService.findOneById(accountId);
    }

    @PostMapping("/create")
    public CreateAccount createOne(@RequestBody() CreateAccount accountInfo) {
        return accountService.createOne(accountInfo);
    }

    @PutMapping("/update/{id}")
    public UpdateAccount updateOne(@RequestBody() UpdateAccount accountInfo) {
        return accountService.updateOne(accountInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathParam("id") UUID accountId) {
        accountService.deleteOne(accountId);
    }
}
