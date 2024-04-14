package io.trainee.organiser.user.repository;

import io.trainee.organiser.user.constant.UserUrlConstants;
import io.trainee.organiser.user.entity.projection.AccountWithoutPassword;
import io.trainee.organiser.user.request.CreateAccountRequest;
import io.trainee.organiser.user.request.UpdateAccountRequest;
import io.trainee.organiser.user.entity.AccountEntity;
import io.trainee.organiser.user.response.AccountView;
import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@RepositoryRestResource(path = UserUrlConstants.ACCOUNTS_URL, collectionResourceRel = UserUrlConstants.ACCOUNTS_URL)
public interface AccountRepository extends JpaRepository<AccountEntity, UUID> {
    AccountEntity findByUserName(@PathParam("userName") String userName);
}
