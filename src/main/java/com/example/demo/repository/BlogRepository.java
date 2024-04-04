package com.example.demo.repository;


import com.example.demo.model.Blog;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class BlogRepository {

    private static List<Blog> blogs;

    static {
        try {
            blogs = new ObjectMapper().readValue(
                    new ClassPathResource("blogs.json").getFile(), 
                    new TypeReference<List<Blog>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to load blogs from file", e);
        }
    }

    public List<Blog> getAllBlogs() {
        return blogs;
    }

    public Blog getBlogById(Long id) {
        return blogs.stream()
                .filter(blog -> blog.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
