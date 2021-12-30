package com.example.module_4_minitest_3012.repository;

import com.example.module_4_minitest_3012.model.Blog;
import com.example.module_4_minitest_3012.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatusRepository extends JpaRepository<Status,Long> {
}
