package com.example.module_4_minitest_3012.service;

import com.example.module_4_minitest_3012.model.Blog;
import com.example.module_4_minitest_3012.model.Status;

public interface IBlogService extends IGeneralService<Blog> {
     Iterable<Blog> findAllByStatus(Status status);
}
