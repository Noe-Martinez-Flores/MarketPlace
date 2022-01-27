package mx.edu.utez.MarketPlace.Category.controller;

import mx.edu.utez.MarketPlace.Category.model.Category;
import mx.edu.utez.MarketPlace.Util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = {"*"})
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public ResponseEntity<Message> getAll(){
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> getById (@PathVariable("id") long id){
        return categoryService.findById(id);
    }

    @PostMapping("/save")
    public ResponseEntity<Message> saveCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.save(new Category(categoryDTO.getDescription()));
    }

    @PutMapping("/update")
    public ResponseEntity<Message> updateCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.update(new Category(categoryDTO.getId(),categoryDTO.getDescription()));
    }

}
