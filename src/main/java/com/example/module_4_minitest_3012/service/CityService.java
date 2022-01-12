package com.example.module_4_minitest_3012.service;

import com.example.module_4_minitest_3012.model.City;
import com.example.module_4_minitest_3012.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService {
    @Autowired
    ICityRepository iCityRepository;

    @Override
    public Iterable<City> findAll() {
        return iCityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return iCityRepository.findById(id);
    }

    @Override
    public void save(City city) {
        iCityRepository.save(city);
    }

    @Override
    public void remote(Long id) {
        iCityRepository.deleteById(id);
    }
}
