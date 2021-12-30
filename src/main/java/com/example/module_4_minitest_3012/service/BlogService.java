package com.example.module_4_minitest_3012.service;

import com.example.module_4_minitest_3012.model.Blog;
import com.example.module_4_minitest_3012.model.Status;
import com.example.module_4_minitest_3012.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Iterable<Blog> findAllByStatus(Status status) {
        return iBlogRepository.findAllByStatus(status);
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void remote(Long id) {
        iBlogRepository.deleteById(id);
    }

}
