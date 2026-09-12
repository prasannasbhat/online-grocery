
package com.example.demo.service;

import com.example.demo.entity.GroceryItem;
import com.example.demo.exception.GroceryItemNotFoundException;
import com.example.demo.repository.GroceryItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemService {

    private final GroceryItemRepository groceryItemRepository;

    public GroceryItemService(GroceryItemRepository groceryItemRepository) {
        this.groceryItemRepository = groceryItemRepository;
    }

    public GroceryItem createGroceryItem(GroceryItem groceryItem) {
        return groceryItemRepository.save(groceryItem);
    }

    public List<GroceryItem> getAllGroceryItems() {
        return groceryItemRepository.findAll();
    }

    public GroceryItem getGroceryItemById(Long id) {
        return groceryItemRepository.findById(id)
                .orElseThrow(() -> new GroceryItemNotFoundException(
                        "Grocery item not found with id: " + id));
    }

    public GroceryItem updateGroceryItem(Long id, GroceryItem groceryItem) {
        GroceryItem existingItem = groceryItemRepository.findById(id)
                .orElseThrow(() -> new GroceryItemNotFoundException(
                        "Grocery item not found with id: " + id));

        existingItem.setName(groceryItem.getName());
        existingItem.setCategory(groceryItem.getCategory());
        existingItem.setPrice(groceryItem.getPrice());
        existingItem.setQuantity(groceryItem.getQuantity());

        return groceryItemRepository.save(existingItem);
    }

    public void deleteGroceryItem(Long id) {
        GroceryItem existingItem = groceryItemRepository.findById(id)
                .orElseThrow(() -> new GroceryItemNotFoundException(
                        "Grocery item not found with id: " + id));

        groceryItemRepository.delete(existingItem);
    }
}


