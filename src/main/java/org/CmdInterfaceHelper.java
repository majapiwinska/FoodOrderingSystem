package org;

import org.meals.Drink;
import org.meals.Meal;
import org.menu.DessertMenu;
import org.menu.DrinkMenu;
import org.menu.Menu;
import org.menu.MenuFactory;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CmdInterfaceHelper {

    public int order() {
        System.out.println("Hello, to order lunch press 1, to order drink press 2");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input == 1 || input == 2){
            return input;
        }else {
            System.out.println("Invalid number, choose again");
            return order();
        }
    }

    public Menu chooseMenuType() {
        System.out.println("Choose a cuisine:");
        System.out.println("Polish: press 1 \n Italian: press 2 \n Mexican: press 3");
        Scanner input =new Scanner(System.in);
        Optional<Menu> choice = MenuFactory.getMenu(input.nextInt());
        if(!choice.isPresent()) {
            System.out.println("Invalid choice");
            return chooseMenuType();
        }
        else
            return choice.get();
        }

    public Meal chooseMeal(Menu menu){
            List<Meal> meals = menu.getMeals();
            System.out.println("Choose main course: ");
            meals.stream().forEach(e -> System.out.println(e.getName() + " " + e.getPrice().toString() + " zł"));
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            //TODO: arrayOutOfTheBox zabezpieczyc
            return meals.get(input - 1);
    }

    public Drink chooseDrink(){
        System.out.println("Choose drink: ");
        Menu menu = new DrinkMenu();
        List<Meal> drinks = menu.getMeals();
        drinks.stream().forEach(e->System.out.println(e.getName()+ " " + e.getPrice().toString() + " zł"));
        Scanner scanner = new Scanner(System.in);
        Drink drink = (Drink) drinks.get(scanner.nextInt()-1);

        System.out.println("Do you want extra lemon? Press y/n");
        char lemon = scanner.nextLine().charAt(0);
        if("y".equals(lemon)){
            drink.setLemon(true);
        }
        System.out.println("Do you want extra ice? Press y/n");
        char ice = scanner.nextLine().charAt(0);
        if("y".equals(ice)){
            drink.setIce(true);
        }
        return drink;
    }


    public void sumUpOrder(List<Meal> orderedMeals){
        System.out.println("You ordered: ");
        orderedMeals.stream().forEach(e -> System.out.println(e.getName() + " " + e.getPrice().toString() + " zł"));
        BigDecimal totalValue = new BigDecimal(0);
        //TODO: total value jest 0
        for(Meal meal: orderedMeals){
            totalValue.add(meal.getPrice());
        }
        System.out.println("Total value of your order is: " + totalValue.toString());

    }
}
