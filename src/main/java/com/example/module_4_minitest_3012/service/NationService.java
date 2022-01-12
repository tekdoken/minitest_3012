package com.example.module_4_minitest_3012.service;

import com.example.module_4_minitest_3012.model.Nation;
import com.example.module_4_minitest_3012.repository.INationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NationService implements INationService {
    @Autowired
    INationRepository iNationRepository;

    @Override
    public Iterable<Nation> findAll() {
        return iNationRepository.findAll();
    }

    @Override
    public Optional<Nation> findById(Long id) {
        return iNationRepository.findById(id);
    }

    @Override
    public void save(Nation nation) {
        iNationRepository.save(nation);
    }

    @Override
    public void remote(Long id) {
        iNationRepository.deleteById(id);
    }
}
