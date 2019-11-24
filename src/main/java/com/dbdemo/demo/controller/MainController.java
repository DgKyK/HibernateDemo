package com.dbdemo.demo.controller;

import com.dbdemo.demo.entity.Company;
import com.dbdemo.demo.entity.Production;
import com.dbdemo.demo.entity.Supply;
import com.dbdemo.demo.repository.CompanyRepository;
import com.dbdemo.demo.repository.ProductionRepository;
import com.dbdemo.demo.repository.SupplyRepository;
import com.dbdemo.demo.service.CompanyService;
import com.dbdemo.demo.service.ProductionService;
import com.dbdemo.demo.service.SupplyService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("main")
public class MainController {
    @Autowired
    private SupplyService supplyService;
    @Autowired
    private ProductionService productionService;
    @Autowired
    private CompanyService companyService;

    public Company insertCompany(Company company) {
        return companyService.save(company);
    }

    public Production insertProduction(Production production) {
        return productionService.save(production);
    }

    public Supply insertSupply(Supply supply) {
        return supplyService.save(supply);
    }

    @GetMapping("/productions")
    public List<Production> getAllProductions() {
        return productionService.findAll();
    }

    @GetMapping("/supplies")
    public List<Supply> getAllSupplies() {
        return supplyService.findAll();
    }

    @GetMapping("/companies")
    public List<Company> getAllCompanies() {
        return companyService.findAll();
    }
}
