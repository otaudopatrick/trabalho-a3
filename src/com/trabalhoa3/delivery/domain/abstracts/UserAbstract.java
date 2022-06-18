package com.trabalhoa3.delivery.domain.abstracts;

import java.util.List;

import com.trabalhoa3.delivery.domain.entities.Address;
import com.trabalhoa3.delivery.domain.entities.Raiting;
import com.trabalhoa3.delivery.domain.enums.UserTypeEnum;

public abstract class UserAbstract {
  private String name;
  private String email;
  private String password;
  private List<Integer> phone;
  private Address address;
  private Raiting raiting;
  private UserTypeEnum type;

  public UserAbstract() {

  }

  public UserAbstract(String name, String email, String password) {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Integer> getPhone() {
    return this.phone;
  }

  public void setPhone(List<Integer> phone) {
    this.phone = phone;
  }

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Raiting getRaiting() {
    return this.raiting;
  }

  public void setRaiting(Raiting raiting) {
    this.raiting = raiting;
  }

  public UserTypeEnum getType() {
    return this.type;
  }

  public void setType(UserTypeEnum type) {
    this.type = type;
  }
}