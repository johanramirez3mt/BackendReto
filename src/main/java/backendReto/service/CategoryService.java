package backendReto.service;

import backendReto.model.Category;
import backendReto.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> obtenerCategory() {
        return categoryRepository.obtenerCategory();
    }

    public Category crearCategory(Category category) {
        return categoryRepository.crearCategory(category);
    }
}
