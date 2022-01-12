package com.example.module_4_minitest_3012.repository;

import com.example.module_4_minitest_3012.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<City, Long> {
}
