package Design_patterns.template_pattern;

public class main {
    public static void main(String[] args) {
        ItalianSandwich cos1 = new ItalianSandwich();
        cos1.make_sandwich();
        System.out.println("\n");

        VeggiHoagie cos2 = new VeggiHoagie();
        cos2.make_sandwich();
    }
}
