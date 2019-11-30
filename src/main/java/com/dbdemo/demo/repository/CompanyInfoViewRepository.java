package com.dbdemo.demo.repository;

import com.dbdemo.demo.entity.CompanyInfoView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyInfoViewRepository extends JpaRepository<CompanyInfoView, Long> {
    @Query(nativeQuery = true, value = "SELECT company.id, company.name as company, month(supply.date) as month, SUM(supply.price) as price, SUM(supply.capacity) as capacity FROM company\n" +
            "JOIN supply ON supply.company_id = company.id\n" +
            "GROUP by company.id")
    List<CompanyInfoView> findAll();
}
