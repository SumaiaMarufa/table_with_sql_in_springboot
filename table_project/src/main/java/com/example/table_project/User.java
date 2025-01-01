package com.example.table_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
  @Table(name = "users")
public class User 
{
    @Id
    @GeneratedValue(strategy=
    GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String address;
    
    // getters and setters
    public long  getID() {return id;}
    public void setID(long id){this.id = id;}

    public String getName(){return name;}
     public void setName(String name){this.name = name;}
     
     public String getEmail(){return email;}
     public void setEmail(String email){this.email = email;}
      
     public String getAddress(){return address;}
     public void setAddress(String address){this.address = address;}
}
