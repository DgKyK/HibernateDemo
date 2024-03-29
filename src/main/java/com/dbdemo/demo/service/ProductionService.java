package com.dbdemo.demo.service;

import com.dbdemo.demo.entity.Production;
import com.dbdemo.demo.entity.ProductionInfoView;
import com.dbdemo.demo.repository.ProductionInfoViewRepository;
import com.dbdemo.demo.repository.ProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionService {
    @Autowired
    private ProductionRepository productionRepository;
    @Autowired
    private ProductionInfoViewRepository productionInfoViewRepository;

    public Production save(Production production) {
        return productionRepository.save(production);
    }


    public List<Production> findAll() {
        return productionRepository.findAll();
    }

    public List<Production> findCheaperProduction() {
        return productionRepository.findCheaperProduction();
    }

    public List<ProductionInfoView> findAllProductionInfo() {
        return productionInfoViewRepository.findAll();
    }
}
