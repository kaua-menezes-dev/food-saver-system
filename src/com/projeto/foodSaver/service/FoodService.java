package com.projeto.foodSaver.service;

import com.projeto.foodSaver.repository.FoodRepository;

public class FoodService {
    FoodRepository repository;

    public FoodService(FoodRepository repository) {
        this.repository = repository;
    }
}
