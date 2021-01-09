package basic;

import java.util.ArrayList;
import java.util.List;

public class WildCardTesting {
    public static void main(String[] args) {

        List<Animal> animal_l = new ArrayList<>();
        animal_l.add(new Animal());
        animal_l.add(new Animal());

        List<Dog> dog_l = new ArrayList<>();
        dog_l.add(new Dog());
        dog_l.add(new Dog());

        List<Cat> cat_l = new ArrayList<>();
        cat_l.add(new Cat());

        tester(animal_l);
        tester(dog_l);
        tester(cat_l);


        /*
         private static void tester(List<? super Dog> list) {}

                -> object
                    -> Animal
                        -> Dog  ^   < super ^^^
        -------------------------------------------

        private static void tester(List<? extends Animal> list)

            -> animal
                -> Dog
                -> Cac

        */

    }

    private static void tester(List<? extends Animal> list) {
//        wild card will take list of objects that
//        can be extended with father class for identification of object
        for (Animal a : list) {
            a.make_sound();
        }
    }

    private static class Animal {
        private static int count = 0;
        private int animal_id;

        public Animal() {
            animal_id = ++count;
        }

        void make_sound() {
            System.out.println("i am animal (all) with id: " + animal_id);
        }

        public String toString() {
            return "animal id: " + animal_id;
        }

    }

    private static class Dog extends Animal {

        private static int count = 0;
        private int dog_id;


        public Dog() {
            dog_id = ++count;
        }

        void make_sound() {
            System.out.println("i am dog (all)");
        }

        void bark() {
            System.out.println("woof woof  (dog only)");
        }

        @Override
        public String toString() {
            return "i am dog id: " + dog_id;
        }
    }

    protected static class Cat extends Animal {
        void make_sound() {
            System.out.println("i am cat (all)");
        }

        void meu() {
            System.out.println("meoo ... (cat only)");
        }
    }
}
