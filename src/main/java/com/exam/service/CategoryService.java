package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.entity.exam.Category;

@Service
public interface CategoryService {
	public Category addCategory(Category category);

	public Category updateCategory(Long categoryId, Category category);

    public List<Category> getCategories();

    public Category getCategory(Long categoryId);

    public void deleteCategory(Long categoryId);

}
