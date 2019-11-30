package com.dbdemo.demo.entity;

import com.dbdemo.demo.entity.enums.Unit;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Production {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private int purchasePrice;
    private LocalDate shelfLife;

    @Enumerated(EnumType.STRING)
    private Unit units;
/*
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "supply_id", nullable = false)
    private Supply supply;*/
}
