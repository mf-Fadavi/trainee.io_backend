package io.trainee.organiser.user.mapper;

import io.trainee.organiser.user.entity.TrainerEntity;
import io.trainee.organiser.user.request.CreateTrainerRequest;
import io.trainee.organiser.user.request.UpdateTrainerRequest;
import io.trainee.organiser.user.response.TrainerView;
import org.mapstruct.Mapper;
import org.mapstruct.SubclassExhaustiveStrategy;

@Mapper(componentModel = "spring", subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public abstract class TrainerMapper {
    public abstract TrainerView toDto (TrainerEntity entity);

    public abstract TrainerEntity toEntity (CreateTrainerRequest CreateTrainerDto);

    public abstract TrainerEntity toEntity (UpdateTrainerRequest UpdateTrainerDto);
}
