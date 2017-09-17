package org;

import org.meals.Drink;
import org.meals.Meal;
import org.menu.DessertMenu;
import org.menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        CmdInterfaceHelper cmdHelper = new CmdInterfaceHelper();
        Order order = new Order(new ArrayList<>());
        List<Meal> orderedMeals = order.getMeals();
        int tmp = cmdHelper.chooseLunchOrDrink();

        if (tmp == 1) {
            Menu menu = cmdHelper.chooseMenuType();
            Meal meal = cmdHelper.chooseMeal(menu);
            orderedMeals.add(meal);
            Meal dessert = cmdHelper.chooseMeal(new DessertMenu());
            orderedMeals.add(dessert);
        } else if (tmp == 2) {
            Drink drink = cmdHelper.chooseDrink();
            cmdHelper.addLemon(drink);
            cmdHelper.addIce(drink);
            orderedMeals.add(drink);
        } else {
            System.out.println("Invalid choice");
            return;
        }
        cmdHelper.sumUpOrder(orderedMeals);
    }
}
