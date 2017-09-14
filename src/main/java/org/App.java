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
        int tmp = cmdHelper.order();

        if (tmp == 1) {
            Menu menu = cmdHelper.chooseMenuType();
            Meal meal = cmdHelper.chooseMeal(menu);
            orderedMeals.add(meal);
            Meal dessert = cmdHelper.chooseMeal(new DessertMenu());
            orderedMeals.add(dessert);
            cmdHelper.sumUpOrder(orderedMeals);
        } else if (tmp == 2) {
            Drink drink = cmdHelper.chooseDrink();
            orderedMeals.add(drink);
            cmdHelper.sumUpOrder(orderedMeals);
        } else
            System.out.println("Invalid choice");


    }

}
