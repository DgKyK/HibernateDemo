package com.dbdemo.demo.service;

import com.dbdemo.demo.entity.Supply;
import com.dbdemo.demo.repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyService {
    @Autowired
    private SupplyRepository supplyRepository;

    public Supply save(Supply supply) {
        return supplyRepository.save(supply);
    }

    public List<Supply> findAll() {
        return supplyRepository.findAll();
    }

    public List<Supply> findSupplyThatHaveShelfLifeLessThanWeek() {
        return supplyRepository.findSupplyThatHaveShelfLifeLessThanWeek();
    }
}
