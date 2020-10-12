package vn.codegym.blog.service;

import vn.codegym.blog.model.Blog;
import vn.codegym.blog.model.Category;

import java.util.List;

public interface CategoryService {
    Iterable<Category> findAll();

    void save(Category category);

    Category findById(int id);

    void update(Category category);

    void remove(Category category);
}
