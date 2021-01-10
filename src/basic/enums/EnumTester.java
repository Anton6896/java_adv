package basic.enums;

public class EnumTester {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;

        // new java will understand the difference by it self
        switch (animal) {
            case CAT, DOG -> System.out.println(animal.get_info());

        }


    }
}
