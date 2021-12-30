package com.example.module_4_minitest_3012.service;

import com.example.module_4_minitest_3012.model.Status;
import com.example.module_4_minitest_3012.repository.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatusService implements IStatusService {
    @Autowired
    IStatusRepository iStatusRepository;

    @Override
    public Iterable<Status> findAll() {
        return iStatusRepository.findAll();
    }

    @Override
    public Optional<Status> findById(Long id) {
        return iStatusRepository.findById(id);
    }

    @Override
    public void save(Status status) {
        iStatusRepository.save(status);
    }

    @Override
    public void remote(Long id) {
        iStatusRepository.deleteById(id);
    }
}
