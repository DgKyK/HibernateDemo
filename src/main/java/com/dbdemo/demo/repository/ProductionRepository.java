package com.dbdemo.demo.repository;

import com.dbdemo.demo.entity.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductionRepository extends JpaRepository<Production, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM production\n" +
            "JOIN supply ON supply.production_id = production.id\n" +
            "WHERE supply.price < production.purchase_price")
    List<Production> findCheaperProduction();
}
