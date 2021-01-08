package basic;

public class Basics {

    private static class Person {
        // will use static class for funder convenience
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        // getters and setters
        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }


        int get_age() {
            return this.age;
        }

        // representation method
        @Override
        public String toString() {
            return "Person{" + "name='" + name + "'}";
        }


    }


    public static void main(String[] args) {
        System.out.println("basic java to remember : \n");
        Person p1 = new Person(23, "name 1");
        System.out.println(p1.toString());
    }
}

