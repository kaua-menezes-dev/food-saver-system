package com.projeto.foodSaver.service;

import com.projeto.foodSaver.model.Food;
import com.projeto.foodSaver.repository.FoodRepository;

import java.util.List;

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

    public void showAllFoods() {
        try {
            List<Food> foods = repository.listAllFood();

            for (Food food : foods) {
                System.out.println(food);
            }

        } catch (Exception e) {
            System.out.println("It's impossible to show an empty list");
        }
    }

    public Food searchFood(String name) {
        return repository.findByName(name);
    }

    public void updateFoodQuantity(String name, int quantity) {
        repository.updateQuantity(name, quantity);
    }

    public void removeFood(String name) {
        repository.removeFood(name);
    }
}
