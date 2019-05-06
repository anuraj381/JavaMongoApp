package com.anuraj.MongoApp.MongoApp.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class orders {
  @Id
  public ObjectId _id;
  
  public String name;
  public String items;
  public String account_number;
  
  // Constructors
  public orders() {}
  
  public orders(ObjectId _id, String name, String items, String account_number) {
    this._id = _id;
    this.name = name;
    this.items = items;
    this.account_number = account_number;
  }
  
  // ObjectId needs to be converted to string
  public String get_id() { return _id.toHexString(); }
  public void set_id(ObjectId _id) { this._id = _id; }
  
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  
  public String getItems() { return items; }
  public void setItems(String items) { this.items = items; }
  
  public String getAccount() { return account_number; }
  public void setAccount(String account) { this.account_number = account; }
}