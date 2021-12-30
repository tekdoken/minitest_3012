package com.example.module_4_minitest_3012.controller;

import com.example.module_4_minitest_3012.model.Blog;
import com.example.module_4_minitest_3012.model.Status;
import com.example.module_4_minitest_3012.service.BlogService;
import com.example.module_4_minitest_3012.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/blogs")
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    StatusService statusService;
    @GetMapping("/list")
    public ResponseEntity<Iterable<Blog>> list() {
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/status")
    public ResponseEntity<Iterable<Status>> listStatus() {
        return new ResponseEntity<>(statusService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/listpublic")
    public ResponseEntity<Iterable<Blog>> listPublic() {
        Long a= Long.valueOf(2);
        Optional<Status > status=statusService.findById(a);
      Iterable<Blog>  blogs=blogService.findAllPublic(status.get());
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Blog> add(@RequestBody Blog blog) {
        LocalDateTime time=LocalDateTime.now();
        blog.setTime(time);
        blogService.save(blog);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Blog> delete(@PathVariable Long id) {
        blogService.remote(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<Optional<Blog>> edit(@PathVariable Long id, @RequestBody Blog blog) {
        Optional<Blog> blogOptional = blogService.findById(id);
        blog.setId(blogOptional.get().getId());
        LocalDateTime time=LocalDateTime.now();
        blog.setTime(time);
        blogService.save(blog);
        return new ResponseEntity<>(blogOptional, HttpStatus.OK);
    }
    @GetMapping("/findOne/{id}")
    public ResponseEntity<Optional<Blog>> findOne(@PathVariable Long id){
        return new ResponseEntity<>(blogService.findById(id),HttpStatus.OK);
    }
}

