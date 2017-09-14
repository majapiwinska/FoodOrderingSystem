package org.menu;

import org.meals.DessertMeal;
import org.meals.Meal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DessertMenu implements Menu {

    Meal meal1 = new DessertMeal("Tiramisu", new BigDecimal(10));
    Meal meal2 = new DessertMeal("Apple pie", new BigDecimal(8));

    public List<Meal> getMeals() {
        List<Meal> meals = new ArrayList<>();
        meals.add(meal1);
        meals.add(meal2);
        return meals;
    }
}
