package com.dbdemo.demo.repository;

import com.dbdemo.demo.entity.ProductionInfoView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductionInfoViewRepository extends JpaRepository<ProductionInfoView, Long> {
    @Query(nativeQuery = true, value = "SELECT production.id, production.full_name as production, company.name as company, SUM(supply.price) as price FROM company\n" +
            "JOIN supply ON supply.company_id = company.id\n" +
            "JOIN production ON supply.production_id = production.id\n" +
            "GROUP by production.id, YEAR(supply.date)")
    List<ProductionInfoView> findAll();
}
