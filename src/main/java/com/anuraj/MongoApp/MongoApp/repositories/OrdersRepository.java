package com.anuraj.MongoApp.MongoApp.repositories;

import com.anuraj.MongoApp.MongoApp.models.orders;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<orders, String> {
  orders findBy_id(ObjectId _id);
}