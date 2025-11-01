package com.javapro.pro.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bookup")
public class Bookup {

    @Id
    @Column(name="phone", nullable = false ,unique = true)
    private Long phone;

    @Column(name = "booking",nullable = false)
    private String booking;

    @Column(name = "pickup",nullable = false)
    private String pickup;

    @Column(name="servicedone", nullable = false)
    private String servicedone;


}
