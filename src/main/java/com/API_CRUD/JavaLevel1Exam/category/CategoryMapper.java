package com.API_CRUD.JavaLevel1Exam.category;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryMapper {
    public Category toCategory(CategoryDto dto){ return new Category(dto.name());}

    public CategoryDto toCategoryDto(Category category){ return new CategoryDto(category.getName());}

    public List<CategoryDto> toCategoryDtoList(List<Category> categories){
        List<CategoryDto> categoryList = new ArrayList<CategoryDto>();
        for(var category : categories){
            categoryList.add(new CategoryDto(category.getName()));
        }

        return categoryList;
    }
}
