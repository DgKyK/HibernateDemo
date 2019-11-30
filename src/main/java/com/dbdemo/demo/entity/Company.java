package com.dbdemo.demo.entity;

import com.dbdemo.demo.entity.enums.Activity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int employeeNumber;

    @Enumerated(EnumType.STRING)
    private Activity activity;
/*
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "supply_id", nullable = false)
    private Supply supply;*/


}
