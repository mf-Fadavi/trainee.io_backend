package io.trainee.organiser.user.mapper;

import io.trainee.organiser.user.entity.TraineeEntity;
import io.trainee.organiser.user.request.CreateTraineeRequest;
import io.trainee.organiser.user.request.UpdateTraineeRequest;
import io.trainee.organiser.user.response.TraineeView;
import org.mapstruct.Mapper;
import org.mapstruct.SubclassExhaustiveStrategy;

@Mapper(componentModel = "spring", subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public abstract   class TraineeMapper {
    public abstract TraineeView toDto (TraineeEntity entity);

    public abstract TraineeEntity toEntity (CreateTraineeRequest createTraineeDto);

    public abstract TraineeEntity toEntity (UpdateTraineeRequest updateTraineeDto);
}