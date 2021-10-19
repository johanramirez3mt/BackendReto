package backendReto.web;


import backendReto.model.Category;
import backendReto.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getCategory() {
        return categoryService.obtenerCategory();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category postCategory(@RequestBody Category category){

        return categoryService.crearCategory(category);
    }
}
