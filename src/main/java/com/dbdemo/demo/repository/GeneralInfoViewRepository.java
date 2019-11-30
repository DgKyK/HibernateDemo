package com.dbdemo.demo.repository;

import com.dbdemo.demo.entity.GeneralInfoView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GeneralInfoViewRepository extends JpaRepository<GeneralInfoView, Long> {
    @Query(nativeQuery = true, value = "SELECT company.id, company.activity, COUNT(distinct company.id) as number_of_company, SUM(production.purchase_price) as year_budget FROM company\n" +
            "JOIN supply ON supply.company_id = company.id\n" +
            "JOIN production ON supply.production_id = production.id\n" +
            "GROUP BY company.activity, YEAR(supply.date)")
    List<GeneralInfoView> findAll();
}
