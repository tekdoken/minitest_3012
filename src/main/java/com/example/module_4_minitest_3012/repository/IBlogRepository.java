package com.example.module_4_minitest_3012.repository;

import com.example.module_4_minitest_3012.model.Blog;
import com.example.module_4_minitest_3012.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface IBlogRepository extends JpaRepository<Blog,Long> {
    Iterable<Blog> findAllByStatus(Status status);
}
