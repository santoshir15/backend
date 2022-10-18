package com.digitalbook.author.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbook.author.entity.Category;
import com.digitalbook.author.repository.CategoryRepository;

@RestController
@RequestMapping("/api/v1/digitalbooks/category")
public class CategoryController {

    @Autowired
    public CategoryRepository categoryRepository;

    @GetMapping("/fetch")
    public List<Category> fetch() {
        return categoryRepository.findAll();
    }

    @PostMapping("/create")
    public Category create(@RequestParam("category") String cate) {
        Category category = new Category();
        category.setCategoryNme(cate);
        return categoryRepository.save(category);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam("categoryid") int cateid) {
        Optional<Category> Optcategory = categoryRepository.findById(cateid);
        Optcategory.ifPresent(ct -> categoryRepository.delete(ct));
    }

}



