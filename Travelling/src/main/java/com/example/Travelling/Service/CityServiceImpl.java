package com.example.Travelling.Service;

import com.example.Travelling.Model.City;
import com.example.Travelling.Repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class CityServiceImpl implements CityService{
    @Autowired
    CityRepo cityRepo;
    @Override
    public City addcity(City city) throws Exception {
        return null;
    }
}
