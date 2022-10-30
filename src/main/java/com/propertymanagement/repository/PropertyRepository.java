package com.propertymanagement.repository;

import com.propertymanagement.entity.PropertyEntity;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Configuration
@Repository
public interface PropertyRepository extends JpaRepository<PropertyEntity,Long> {

}
