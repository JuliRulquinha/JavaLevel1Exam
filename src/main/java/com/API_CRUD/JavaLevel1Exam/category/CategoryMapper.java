package com.API_CRUD.JavaLevel1Exam.category;

import org.springframework.stereotype.Service;

@Service
public class CategoryMapper {
    public Category toCategory(CategoryDto dto){ return new Category(dto.name());}
    public CategoryDto toCategoryDto(Category category){ return new CategoryDto(category.getName());}
}
