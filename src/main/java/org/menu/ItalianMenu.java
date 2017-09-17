package org.menu;

import org.meals.ItalianMeal;
import org.meals.Meal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItalianMenu implements Menu {

    private List<Meal> meals = Arrays.asList(new ItalianMeal("Pizza margherita",  new BigDecimal(23)),
            new ItalianMeal("Spaghetti bolognese",  new BigDecimal(21)));

    public List<Meal> getMeals() {
        return meals;
    }
}
