package com.dbdemo.demo.service;

import com.dbdemo.demo.entity.GeneralInfoView;
import com.dbdemo.demo.entity.SuppliesViews;
import com.dbdemo.demo.entity.Supply;
import com.dbdemo.demo.repository.GeneralInfoViewRepository;
import com.dbdemo.demo.repository.SuppliesViewsRepository;
import com.dbdemo.demo.repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyService {
    @Autowired
    private SupplyRepository supplyRepository;
    @Autowired
    private SuppliesViewsRepository suppliesViewsRepository;
    @Autowired
    private GeneralInfoViewRepository generalInfoViewRepository;

    public Supply save(Supply supply) {
        return supplyRepository.save(supply);
    }

    public List<Supply> findAll() {
        return supplyRepository.findAll();
    }

    public List<Supply> findSupplyThatHaveShelfLifeLessThanWeek() {
        return supplyRepository.findSupplyThatHaveShelfLifeLessThanWeek();
    }

    public List<SuppliesViews> findAllSuppliesViews() {
        return suppliesViewsRepository.findAll();
    }

    public List<GeneralInfoView> findAllGeneralInfo() {
        return generalInfoViewRepository.findAll();
    }
}
