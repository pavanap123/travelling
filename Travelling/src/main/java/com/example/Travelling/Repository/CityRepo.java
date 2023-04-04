package com.example.Travelling.Repository;

import com.example.Travelling.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface CityRepo extends JpaRepository<City,Integer> {
}
