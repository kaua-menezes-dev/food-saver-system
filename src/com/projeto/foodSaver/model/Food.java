package com.projeto.foodSaver.model;

public class Food {
    private String name;
    private String category;
    private int quantity;

    public Food(String name, String category, int quantity) throws Exception {
        this.name = name;
        this.category = category;
        this.quantity = quantity;

        if (name == null || name.trim().isEmpty()) {
            throw new Exception("Não é possivel criar uma comida sem o nome!");
        }

        if (quantity < 0) {
            throw new Exception("Não é possivel registar uma quantidade negativa de comida!");
        }
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Nome: " + this.getName());
        System.out.println("Categoria: " + this.getCategory());
        System.out.println("Quantidade: " + this.getQuantity());
    }

    @Override
    public String toString() {
        return "Nome:" + this.getName() +
                "| Categoria: " + this.getCategory() +
                "| Quantidade: " + this.getQuantity();
    }
}
