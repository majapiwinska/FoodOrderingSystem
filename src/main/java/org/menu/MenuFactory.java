package org.menu;

import java.util.Optional;

public class MenuFactory {

    public static Optional<Menu> getMenu(int x){
       Optional<Menu> menu = null;

        switch(x){
            case(1):
                menu = Optional.of(new PolishMenu());
                break;
            case(2):
                menu = Optional.of(new ItalianMenu());
                break;
            case(3):
                menu = Optional.of(new MexicanMenu());
                break;
            default:
                menu = Optional.empty();
                System.out.println("Invalid number!");
                break;
        }
        return menu;
    }
}
