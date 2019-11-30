package com.dbdemo.demo.entity;

import com.dbdemo.demo.entity.enums.Activity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Immutable;

import javax.persistence.*;

@Entity
@Immutable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneralInfoView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Activity activity;
    private int numberOfCompany;
    private long yearBudget;
}
