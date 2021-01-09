package basic;
// its will be the god object with all basic testing
// and implementation for more comfort

import basic.interface_my.*;

public class Basics {
    // entrance
    public static void main(String[] args) {
//        person_tester();
//        str_testing();
//        teacher_tester();
        interface_testing();

    }

    // ==========   god object , classes and function in one place  =============

    // cant change this
    final static double PI = 1.345;

    private static class Person {
        // will use static class for funder convenience
        private int age;
        private String name;
        public static String description;
        // id will count all person classes !
        private static int id = 0;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
            id++;
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

        int get_id() {
            return id;
        }

        void speak() {
            System.out.println("i am person");
        }
    }

    private static void person_tester() {
        Person p1 = new Person(23, "name 1");
        System.out.println(p1.toString());
        System.out.println("p1 id: " + p1.get_id());

        // static and final arguments
        Person.description = "some static description that can be accessed from any where ";
        Person p2 = new Person(43, "danik");
        // can see that the static id will count persons objects
        System.out.println("p2 id: " + p2.get_id());
        System.out.println("Pi number that final : " + PI);
    }

    // string builder
    private static void str_testing() {
        String x = "hello";  // will be garbage collected
        String s = x.toUpperCase();
        System.out.println("string to upper case return new string : " + s);

        String s1 = "hhh";
        String s2 = "kkk";
        String s3 = s1 + s2;  // crete new object
        System.out.println("regular concat '+' : " + s3);
        // better use string builder ( more Efficient )

        StringBuilder sb = new StringBuilder("init word -> ");
        System.out.println("from sb : " + sb);
        sb.append(s1).append(s2);
        System.out.println("better sb with append : " + sb);


    }

    // inheritance
    private static class Teacher extends Person {
        private String lesson;

        public Teacher(int age, String name, String lesson) {
            super(age, name);
            this.lesson = lesson;
        }

        @Override
        public String toString() {
            return "i am person and also Teacher for : " + this.lesson;
        }

        void speak() {
            System.out.println("i am Teacher");
        }
    }

    private static void teacher_tester() {
        Person tec0 = new Person(32, "person _1");
        System.out.println("person to person -> " + tec0);


        Person tec1 = new Teacher(32, "tech 1", "math");
        System.out.println("person to teacher -> " + tec1);

        Teacher tec2 = new Teacher(32, "tech 2", "music");
        System.out.println("teacher to teacher -> " + tec2);

//        Teacher tec4 = new Person(32, "tech 2"); // error


    }

    // interface
    private static class Dog implements Animal {
        // after implementing interface Animal
        // dog is must to implement all interface methods
        private final String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public void sleep() {
            System.out.println("dog " + this.name + " is sleeping");
        }

        @Override
        public void voice() {
            System.out.println("i am barking !! ");
        }
    }

    private static void interface_testing() {
        Dog dog1 = new Dog("newDog");
        dog1.sleep();
        dog1.voice();
    }


}

