package com.projeto.foodSaver.service;

import com.projeto.foodSaver.model.Food;
import com.projeto.foodSaver.repository.FoodRepository;

public class FoodService {
    FoodRepository repository;

    public FoodService(FoodRepository repository) {
        this.repository = repository;
    }

    public void registerFood(String name, String category, int quantity) {
        try {
            var newFood = new Food(name, category, quantity);
            repository.saveFood(newFood);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
