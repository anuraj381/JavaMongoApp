package com.anuraj.MongoApp.MongoApp;

import com.anuraj.MongoApp.MongoApp.models.orders;
import com.anuraj.MongoApp.MongoApp.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.bson.types.ObjectId;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
  @Autowired
  private OrdersRepository repository;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<orders> getAllOrders() {
    return repository.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public orders getOrderById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyOrderById(@PathVariable("id") ObjectId id, @Valid @RequestBody orders ordrs) {
    ordrs.set_id(id);
    repository.save(ordrs);
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public orders createOrder(@Valid @RequestBody orders ordrs) {
    ordrs.set_id(ObjectId.get());
    repository.save(ordrs);
    return ordrs;
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteOrder(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }
}