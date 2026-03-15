package com.projeto.foodSaver.repository;

import com.projeto.foodSaver.model.Food;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {
    List<Food> foods = new ArrayList<>();

    public Food findByName(String name) {
        for (Food food : foods) {
            if (food.getName().equalsIgnoreCase(name)) {
                return food;
            }
        }

        return null;
    }

    public void updateQuantity(String name, int quantity) {
        for (Food food : foods) {
            if (food.getName().equalsIgnoreCase(name)) {
                food.setQuantity(quantity);
            }
        }
    }

    public void removeFood(String name) {
        Food foodToRemove = null;

        for (Food food : foods) {
            if (food.getName().equalsIgnoreCase(name)) {
                foodToRemove = food;
            }
        }

        if (foodToRemove != null) {
            foods.remove(foodToRemove);
        }
    }

    public void saveFood(Food food) {
        foods.add(food);
    }

    public List<Food> listAllFood() {
        if (foods.isEmpty()) {
            return null;
        }

        return foods;
    }
}
