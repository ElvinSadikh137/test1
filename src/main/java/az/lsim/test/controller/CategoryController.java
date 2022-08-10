package az.lsim.test.controller;

import az.lsim.test.model.Category;
import az.lsim.test.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@Slf4j
@RequiredArgsConstructor
public class CategoryController {
    @Autowired
    private final CategoryService categoryService;

    @GetMapping("/getCategory")
    public List<Category> getAllCategory() {
        return categoryService.getAll();
    }

    @PostMapping("/addCategory")
    public void addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }

    @DeleteMapping("/deleteCategory/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }

}
