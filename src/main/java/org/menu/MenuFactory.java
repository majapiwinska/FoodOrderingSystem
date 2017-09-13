package org.menu;

public class MenuFactory {

    static Menu getMenu(int x){
       Menu menu = null;

        switch(x){
            case(1):
                menu = new PolishMenu();
                break;
            case(2):
                menu = new ItalianMenu();
                break;
            case(3):
                menu = new MexicanMenu();
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
        return menu;
    }
}
