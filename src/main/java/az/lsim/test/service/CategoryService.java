package az.lsim.test.service;

import az.lsim.test.model.Category;
import az.lsim.test.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public void addCategory(Category category){
        categoryRepository.save(category);
    }
    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }

    public List<Category> getAll() {
    return categoryRepository.findAll();
    }
}
