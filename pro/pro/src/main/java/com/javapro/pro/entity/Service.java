package com.javapro.pro.entity;

import lombok.*;

import jakarta.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="ser_name", nullable = false)
    private String ser_name;

    @Column(name="ser_des", nullable = false)
    private String ser_des;

    @Column(name="ser_code", nullable = false)
    private String ser_code;

}
