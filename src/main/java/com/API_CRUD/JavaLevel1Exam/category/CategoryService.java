package com.API_CRUD.JavaLevel1Exam.category;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository repository;
    private final CategoryMapper mapper;

    public CategoryService(CategoryRepository repository, CategoryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CategoryDto saveCategory(CategoryDto dto){
        var category = mapper.toCategory(dto);
        var savedCategory = repository.save(category);
        return mapper.toCategoryDto(savedCategory);
    }

    public List<Category> getAllCategories(){
        return repository.findAll();
    }

    public CategoryDto getCategoryById(Integer id){
        return repository.findById(id)
                .map(mapper::toCategoryDto)
                .orElse(null);
    }



    public void deleteCategoryById(Integer id){
        repository.deleteById(id);
    }
}
