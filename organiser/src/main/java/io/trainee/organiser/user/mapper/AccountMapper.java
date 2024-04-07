package io.trainee.organiser.user.mapper;

import io.trainee.organiser.user.entity.AccountEntity;
import io.trainee.organiser.user.entity.RoleEntity;
import io.trainee.organiser.user.request.CreateAccountRequest;
import io.trainee.organiser.user.request.UpdateAccountRequest;
import io.trainee.organiser.user.response.AccountView;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.SubclassExhaustiveStrategy;

import java.util.List;

@Mapper(componentModel = "spring", subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public abstract class AccountMapper {

    public abstract AccountView toDto (AccountEntity entity);

    public abstract List<AccountView> toDto (List<AccountEntity> entity);

    public abstract RoleEntity toEntity (String name);

    public abstract AccountEntity toEntity (CreateAccountRequest createAccountDto);

    public abstract AccountEntity toEntity (UpdateAccountRequest updateAccountDto);
}
