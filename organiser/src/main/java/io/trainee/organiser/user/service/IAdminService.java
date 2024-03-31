package io.trainee.organiser.user.service;

import io.trainee.organiser.user.entity.AdminEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IAdminService {
     List<AdminEntity> findAll();

     Optional<AdminEntity> findOneById(UUID adminId);

     AdminEntity createOne(AdminEntity adminInfo);

     AdminEntity updateOne(AdminEntity adminInfo);

     void deleteOne(UUID adminId);
}
