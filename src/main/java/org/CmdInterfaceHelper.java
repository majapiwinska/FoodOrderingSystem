package org;

import org.meals.Drink;
import org.meals.Meal;
import org.menu.DrinkMenu;
import org.menu.Menu;
import org.menu.MenuFactory;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CmdInterfaceHelper {

    // todo
    public int chooseLunchOrDrink() {
        System.out.println("Hello, to chooseLunchOrDrink lunch press 1, to chooseLunchOrDrink drink press 2");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1 || input == 2) {
            return input;
        } else {
            System.out.println("Invalid number, choose again");
            return chooseLunchOrDrink();
        }
    }

    public Menu chooseMenuType() {
        System.out.println("Choose a cuisine:");
        System.out.println("Polish: press 1 \n Italian: press 2 \n Mexican: press 3");
        Scanner input = new Scanner(System.in);
        Optional<Menu> choice = MenuFactory.getMenu(input.nextInt());
        if (!choice.isPresent()) {
            System.out.println("Invalid choice");
            return chooseMenuType();
        } else
            return choice.get();
    }

    public Meal chooseMeal(Menu menu) {
        List<Meal> meals = menu.getMeals();
        System.out.println("Choose main course: ");
        meals.stream().forEach(e -> System.out.println(e.getName() + " " + e.getPrice().toString() + " zł"));
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt() - 1;
        if (input > meals.size() || input < 0) {
            System.out.println("Invalid choice");
            return chooseMeal(menu);
        }
        return meals.get(input);
    }

    public Drink chooseDrink() {
        System.out.println("Choose drink: ");
        Menu menu = new DrinkMenu();
        List<Meal> drinks = menu.getMeals();
        drinks.stream().forEach(e -> System.out.println(e.getName() + " " + e.getPrice().toString() + " zł"));
        Scanner scanner = new Scanner(System.in);
        Drink drink = (Drink) drinks.get(scanner.nextInt() - 1);
        return drink;
    }

    public Drink addLemon(Drink drink) {
        System.out.println("Do you want extra lemon? Press y/n");
        Scanner scanner = new Scanner(System.in);
        String lemon = scanner.nextLine();
        if (lemon.equals("y")) {
            drink.setLemon(true);
            System.out.println("Lemon added");
        } else if (lemon.equals("n")) {
            drink.setLemon(false);
        }
        return drink;
    }

    public Drink addIce(Drink drink) {
        System.out.println("Do you want extra ice? Press y/n");
        Scanner scanner = new Scanner(System.in);
        String ice = scanner.nextLine();
        if (ice.equals("y")) {
            drink.setIce(true);
        } else if (ice.equals("n")) {
            drink.setIce(false);
        }
        return drink;
    }

    public void sumUpOrder(List<Meal> orderedMeals) {
        System.out.println("You ordered: ");
        orderedMeals.stream().forEach(e -> System.out.println(e.getName() + " " + e.getPrice().toString() + " zł"));
        BigDecimal totalValue = new BigDecimal(0);
        //TODO: total value jest 0

        orderedMeals.stream().forEach(e -> totalValue.add(e.getPrice()));
        System.out.println("Total value of your chooseLunchOrDrink is: " + totalValue.toString());

    }
}
