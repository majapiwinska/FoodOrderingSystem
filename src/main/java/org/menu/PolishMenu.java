package org.menu;

import org.meals.Meal;
import org.meals.PolishMeal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class PolishMenu implements Menu {

    private Meal meal1 = new PolishMeal("Dumplings", new BigDecimal(13));
    private Meal meal2 = new PolishMeal("Potato pancakes", new BigDecimal(14));


    public List<Meal> getMeals() {
        List<Meal> meals = new ArrayList<Meal>();
        meals.add(meal1);
        meals.add(meal2);
        return meals;
    }
}
