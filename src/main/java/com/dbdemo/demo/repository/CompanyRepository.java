package com.dbdemo.demo.repository;

import com.dbdemo.demo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM company " +
            "JOIN supply ON supply.company_id = company.id " +
            "group by supply.company_id " +
            "having count(*) > 1")
    List<Company> findAllCompanyWithSuppliesBiggerThanOne();
    @Query(nativeQuery = true, value = "SELECT * FROM company \n" +
            "JOIN supply On supply.company_id = company.id \n" +
            "JOIN (\n" +
            "SELECT supply.company_id, count(*) as c From supply\n" +
            "WHERE supply.production_id = 5\n" +
            "group by supply.company_id\n" +
            "order by c desc\n" +
            ") as c ON c.company_id = company.id\n" +
            "WHERE c.company_id = company.id\n" +
            "AND production_id = 5\n" +
            "Order by c.c desc\n" +
            "LIMIT 1")
    Company findLeaderBananaSuppliersCompany();
}
