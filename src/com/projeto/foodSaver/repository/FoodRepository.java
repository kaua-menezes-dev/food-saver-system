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
}
