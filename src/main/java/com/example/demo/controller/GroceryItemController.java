package com.example.demo.controller;

import com.example.demo.entity.GroceryItem;
import com.example.demo.service.GroceryItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grocery-items")
public class GroceryItemController {

    private final GroceryItemService groceryItemService;

    public GroceryItemController(GroceryItemService groceryItemService) {
        this.groceryItemService = groceryItemService;
    }

    @PostMapping
    public GroceryItem createGroceryItem(@RequestBody GroceryItem groceryItem) {
        return groceryItemService.createGroceryItem(groceryItem);
    }

    @GetMapping
    public List<GroceryItem> getAllGroceryItems() {
        return groceryItemService.getAllGroceryItems();
    }

    @GetMapping("/{id}")
    public GroceryItem getGroceryItemById(@PathVariable Long id) {
        return groceryItemService.getGroceryItemById(id);
    }

    @PutMapping("/{id}")
    public GroceryItem updateGroceryItem(
            @PathVariable Long id,
            @RequestBody GroceryItem groceryItem) {
        return groceryItemService.updateGroceryItem(id, groceryItem);
    }

    @DeleteMapping("/{id}")
    public void deleteGroceryItem(@PathVariable Long id) {
        groceryItemService.deleteGroceryItem(id);
    }
}