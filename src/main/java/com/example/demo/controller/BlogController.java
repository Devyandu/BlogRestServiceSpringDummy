package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping
    public List<Blog> getAllBlogs() {
        System.out.println("Doing a getAll");
        return blogRepository.getAllBlogs();
    }

    @GetMapping("/{id}")
    public Blog getBlogById(@PathVariable Long id) {
        System.out.println("Doing a get by id="+id);
        return blogRepository.getBlogById(id);
    }
}
