package com.example.loginbackend.Services;

import com.example.loginbackend.Entity.Category;
import com.example.loginbackend.Exceptions.ResourceNotFoundException;
import com.example.loginbackend.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    public CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public  Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(int id ){
        return categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category","Id",id));


    }

    public Category updateCategory(Category category,int id){
        Category c = categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category","ID",id));
        c.setName(category.getName());
        c.setEnabled(category.getEnabled());
        categoryRepository.save(c);
        return c;

    }

    public void  deleteCategoryById(int id) {
        categoryRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Employee","ID",id));
        categoryRepository.deleteById(id);
    }



}
