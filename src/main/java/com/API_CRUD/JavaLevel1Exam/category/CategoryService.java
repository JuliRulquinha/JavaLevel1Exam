package com.API_CRUD.JavaLevel1Exam.category;

import java.util.List;

import jakarta.persistence.EntityNotFoundException;
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

    public List<CategoryDto> getAllCategories(){
         var categoryList = repository.findAll();
         return mapper.toCategoryDtoList(categoryList);
    }

    public CategoryDto getCategoryById(Integer id){
        return repository.findById(id)
                .map(mapper::toCategoryDto)
                .orElse(null);
    }

    public CategoryDto updateCategoryById(Integer id, CategoryUpdateDto updateDto){

        var categoryFromDb = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No category was found with the id: "+ id));

        categoryFromDb.setName(updateDto.name());
        var updatedCategory = repository.save(categoryFromDb);

        return mapper.toCategoryDto(updatedCategory);
    }

    public void deleteCategoryById(Integer id){
        repository.deleteById(id);
    }
}
