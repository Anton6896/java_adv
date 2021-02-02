package Design_patterns.template_pattern;

public class ItalianSandwich extends Hogie {

    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};


    @Override
    void add_meat() {
        System.out.print("Adding meat :: ");
        for (String s : meatUsed) {
            System.out.print(s + " ");
        }
        System.out.println("");

    }

    @Override
    void add_chase() {
        System.out.print("Adding cheese :: ");
        for (String s : cheeseUsed) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }

    @Override
    void add_condiments() {
        System.out.print("Adding condiments :: ");
        for (String s : condimentsUsed) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }

    @Override
    void add_vegetables() {
        System.out.print("Adding vegetables :: ");
        for (String s : veggiesUsed) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
}
