package Design_patterns.template_pattern;

public class VeggiHoagie extends Hogie {

    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    void add_meat() {

    }

    @Override
    void add_chase() {

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
