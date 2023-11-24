package com.exam.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.exam.Category;
import com.exam.repo.CategoryRepository;
import com.exam.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category addCategory(Category category) {
		return this.categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Long categoryId,Category category) {
		Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
		if(optionalCategory.isPresent())
		{
			Category existingCategory =  optionalCategory.get();
			existingCategory.setTitle(category.getTitle());
			existingCategory.setDescription(category.getDescription());
			
			return categoryRepository.save(existingCategory);
		}
		return null;
	}

	@Override
	public List<Category> getCategories() {
		return this.categoryRepository.findAll();
		
	}

	@Override
	public Category getCategory(Long categoryId) {
		return this.categoryRepository.findById(categoryId).get();
	}

	@Override
	public void deleteCategory(Long categoryId) {
		
		this.categoryRepository.deleteById(categoryId);
		
	}

}
