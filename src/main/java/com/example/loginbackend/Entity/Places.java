package com.example.loginbackend.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Places")
public class Places {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private String Category;
    private String State;
    private String Country;
    private String ReferenceNo;
    private String Email;
    private String Address;


}
