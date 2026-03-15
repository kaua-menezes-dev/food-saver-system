package com.projeto.foodSaver.main;

import com.projeto.foodSaver.repository.FoodRepository;
import com.projeto.foodSaver.service.FoodService;

import java.util.Scanner;

public class Menu {
    static void main() {
        Scanner scan = new Scanner(System.in);
        FoodRepository foodRepository = new FoodRepository();
        FoodService newFood = new FoodService(foodRepository);
        int option;

        do {
            System.out.println("""
                    ------ Welcome to Food Saver System ------
                    ------ Starting the program... ------
                    
                    1 - Register Food
                    2 - List all food
                    3 - Search food by name
                    4 - Update the amount of food on the list
                    5 - Remove the food from the list
                    0 - Exit
                    """);

            System.out.print("Choose an option: ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1: {
                    System.out.print("Name of the food: ");
                    String name = scan.nextLine();

                    System.out.print("Name of food category: ");
                    String category = scan.nextLine();

                    System.out.print("Set quantity: ");
                    int quantity = scan.nextInt();
                    scan.nextLine();

                    newFood.registerFood(name, category, quantity);
                    break;

                }

                case 2: {
                    newFood.showAllFoods();
                    break;
                }

                case 3: {
                    System.out.print("Name of the food: ");
                    String name = scan.nextLine();
                    newFood.searchFood(name);
                    break;
                }

                case 4: {
                    System.out.print("Name of the food: ");
                    String name = scan.nextLine();

                    System.out.print("Set quantity: ");
                    int quantity = scan.nextInt();
                    scan.nextLine();

                    newFood.updateFoodQuantity(name, quantity);
                    break;
                }

                case 5: {
                    System.out.print("Name of the food: ");
                    String name = scan.nextLine();
                    newFood.removeFood(name);
                    break;
                }
            }

        } while (option != 0);
    }
}

