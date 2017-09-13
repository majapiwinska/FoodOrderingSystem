package org.menu;

import org.meals.Meal;
import org.meals.MexicanMeal;

import java.math.BigDecimal;
import java.util.List;

public class MexicanMenu implements Menu {

    MexicanMeal meal1 = new MexicanMeal("Burito", new BigDecimal(16));

    public List<Meal> getMeals() {
        return null;
    }
}
