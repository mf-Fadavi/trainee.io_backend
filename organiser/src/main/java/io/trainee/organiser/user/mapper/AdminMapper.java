package io.trainee.organiser.user.mapper;

import io.trainee.organiser.user.entity.AdminEntity;
import io.trainee.organiser.user.request.CreateAdminRequest;
import io.trainee.organiser.user.request.UpdateAdminRequest;
import io.trainee.organiser.user.response.AdminView;
import org.mapstruct.Mapper;
import org.mapstruct.SubclassExhaustiveStrategy;

@Mapper(componentModel = "spring", subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public abstract class AdminMapper {

    public abstract AdminView toDto (AdminEntity entity);

    public abstract AdminEntity toEntity (CreateAdminRequest createAdminDto);

    public abstract AdminEntity toEntity (UpdateAdminRequest updateAdminDto);
}
