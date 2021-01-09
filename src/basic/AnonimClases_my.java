package basic;

interface SomeAnonymousClass {
    void eat();

    void connection(int type);
}

public class AnonimClases_my {
    public static void main(String[] args) {
        Animal an1 = new Animal();
        an1.eat();

        // anonymous class :
        // create one time use class >>
        Animal an2 = new Animal() {
            void eat() {
                System.out.println("\tother eat method");
            }
        };
        an2.eat();


        // usually in this way by using the interface its more common tu use anonymous classes
        SomeAnonymousClass sac = new SomeAnonymousClass() {
            @Override
            public void eat() {
                System.out.println("eating som thind ");
            }

            @Override
            public void connection(int type) {
                System.out.println("connecting to some place ,  data:" + type);
            }
        };
        sac.connection(1);
    }

    private static class Animal {
        void eat() {
            System.out.println("animal eating ");
        }
    }
}
