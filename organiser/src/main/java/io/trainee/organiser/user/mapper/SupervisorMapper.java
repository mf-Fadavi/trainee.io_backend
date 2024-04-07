package io.trainee.organiser.user.mapper;

import io.trainee.organiser.user.entity.SupervisorEntity;
import io.trainee.organiser.user.request.CreateSupervisorRequest;
import io.trainee.organiser.user.request.UpdateSupervisorRequest;
import io.trainee.organiser.user.response.SupervisorView;
import org.mapstruct.Mapper;
import org.mapstruct.SubclassExhaustiveStrategy;

@Mapper(componentModel = "spring", subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public abstract class SupervisorMapper {

    public abstract SupervisorView toDto (SupervisorEntity entity);

    public abstract SupervisorEntity toEntity (CreateSupervisorRequest createSupervisorDto);

    public abstract SupervisorEntity toEntity (UpdateSupervisorRequest updateSupervisorDto);
}
