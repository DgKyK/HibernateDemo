package com.dbdemo.demo.repository;

import com.dbdemo.demo.entity.Company;
import com.dbdemo.demo.entity.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplyRepository extends JpaRepository<Supply, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM supply\n" +
            "JOIN production ON production.id = supply.production_id\n" +
            "WHERE production.shelf_life - supply.date < '00000007'")
    List<Supply> findSupplyThatHaveShelfLifeLessThanWeek();
}
