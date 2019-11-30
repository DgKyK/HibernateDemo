package com.dbdemo.demo.service;

import com.dbdemo.demo.entity.Company;
import com.dbdemo.demo.entity.CompanyInfoView;
import com.dbdemo.demo.repository.CompanyInfoViewRepository;
import com.dbdemo.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private CompanyInfoViewRepository companyInfoViewRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company save(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public List<Company> findAllCompanyWithSuppliesBiggerThanOne() {
        return companyRepository.findAllCompanyWithSuppliesBiggerThanOne();
    }
    public Company findLeaderBananaSuppliesCompany() {
        return companyRepository.findLeaderBananaSuppliersCompany();
    }

    public List<CompanyInfoView> findAllCompanyInfoView() {
        return companyInfoViewRepository.findAll();
    }
}
