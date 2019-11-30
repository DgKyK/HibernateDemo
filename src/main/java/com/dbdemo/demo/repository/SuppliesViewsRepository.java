package com.dbdemo.demo.repository;

import com.dbdemo.demo.entity.SuppliesViews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SuppliesViewsRepository extends JpaRepository<SuppliesViews, Long> {
    @Query(nativeQuery = true, value = "SELECT supply.id as id, SUM(supply.capacity) as capacity, company.name as company, production.full_name as production, YEAR(supply.date) as year From company\n" +
            "Join supply ON supply.company_id = company.id\n" +
            "Join production ON supply.production_id = production.id\n" +
            "group by company.id")
    List<SuppliesViews> findAll();
}
