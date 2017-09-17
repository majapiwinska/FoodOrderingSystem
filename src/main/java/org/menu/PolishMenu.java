package org.menu;

import org.meals.Meal;
import org.meals.PolishMeal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PolishMenu implements Menu {

    private List<Meal> meals = Arrays.asList(new PolishMeal("Dumplings", new BigDecimal(13)),
            new PolishMeal("Potato pancakes", new BigDecimal(14)));

    public List<Meal> getMeals() {
        return meals;
    }
}
