package org.menu;

import org.meals.DessertMeal;
import org.meals.Meal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class DessertMenu implements Menu {

    private List<Meal> meals =
            Arrays.asList(
                    new DessertMeal("Tiramisu", new BigDecimal(10)),
                    new DessertMeal("Apple pie", new BigDecimal(8)));

    public List<Meal> getMeals() {
        return meals;
    }
}
