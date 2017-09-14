package org.menu;

import org.meals.Meal;
import org.meals.MexicanMeal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MexicanMenu implements Menu {

    private MexicanMeal meal1 = new MexicanMeal("Burito", new BigDecimal(16));
    private MexicanMeal meal2 = new MexicanMeal("Quesadilla", new BigDecimal(18));

    public List<Meal> getMeals() {
        List<Meal> meals = new ArrayList<Meal>();
        meals.add(meal1);
        meals.add(meal2);
        return meals;
    }
}
