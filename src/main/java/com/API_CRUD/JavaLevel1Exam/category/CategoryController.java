package com.API_CRUD.JavaLevel1Exam.category;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryService categoryService;


    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/categories")
    public CategoryDto save(
            @RequestBody CategoryDto dto
    ){
        return categoryService.saveCategory(dto);
    }

    @GetMapping("/categories")
    public List<CategoryDto> getAll(){
        return categoryService.getAllCategories();
    }

    @PutMapping("/categories/{id}")
    public CategoryDto updateById(
            @PathVariable Integer id,
            @RequestBody CategoryUpdateDto updateDto
    ){
        var dto = new CategoryUpdateDto(updateDto.name());
        return categoryService.updateCategoryById(id, dto);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategoryById(
            @PathVariable Integer id
    ){
        categoryService.deleteCategoryById(id);
    }

}
