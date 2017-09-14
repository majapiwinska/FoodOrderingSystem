package org.menu;

import org.meals.ItalianMeal;
import org.meals.Meal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItalianMenu implements Menu {

    private Meal meal1 = new ItalianMeal("Pizza margherita",  new BigDecimal(23));
    private Meal meal2 = new ItalianMeal("Spaghetti bolognese",  new BigDecimal(21));

    public List<Meal> getMeals() {
        List<Meal> meals = new ArrayList<Meal>();
        meals.add(meal1);
        meals.add(meal2);
        return meals;
    }
}
