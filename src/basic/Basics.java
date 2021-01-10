package basic;
// its will be the god object with all basic testing
// and implementation for more comfort

import basic.interface_my.*;

import java.nio.charset.Charset;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Basics {

    public static void main(String[] args) {
// basic data , to remember :

        int a = 123;
        double b = a; // auto
        int c = (int) b; // must specify  !!

//        basic primitive equality:
        int g = 1, h = 2;
        System.out.println("integer equality : " + (g == h));
//        object equality -> .equals() method
        String s1 = "abc";
        String s3 = "abc";
        String s2 = "def";
        System.out.println("object equality : " + (s1.equals(s2)));
        System.out.println("object equality : " + (s1.equals(s3)));

//        Teacher object equality check
        Teacher t1 = new Teacher(23, "fff", "ggg");
        Teacher t2 = new Teacher(32, "ttt", "AAA");
//        System.out.println("t1 id:" + t1.get_id() + " -- t2 id:" + t2.get_id());
        System.out.format("t1 : %d <>  t2 : %d\n", t1.get_id(), t2.get_id());
        System.out.println("teacher equality : " + (t1.is_equals(t2)));


//        person_tester();
//        str_testing();
//        teacher_tester();
//        interface_testing();
//        generics_tester();
        l();

    }

    // ==========   god object , classes and function (testers) in one place  =============

    // cant change this
    final static double PI = 1.345;

    private static class Person {
        // will use static class for funder convenience
        private int age;
        private String name;
        public static String description;
        // id will count all person classes !
        private int id = 0;
        private static int counter = 0;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
            id = ++counter;
        }

        int show_id() {
            return this.id;
        }

        // getters and setters
        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }


        String getName() {
            return this.name;
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
            System.out.println("i am person with name : " + this.name);
        }

        boolean is_equals(Person other) {
            return this.id == other.id;
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
            return "i am Teacher for : " + this.lesson;
        }

        @Override
        void speak() {
            System.out.println("i am Teacher name: " + super.getName());
        }

        void teach() {
            System.out.println("i am teaching ! with name: " + super.getName());
        }

        int get_id() {
            return super.get_id();
        }
    }

    private static void teacher_tester() {

        System.out.println(" -- Person -> teacher");
        Person tec1 = new Teacher(32, "tech 1", "math");
        tec1.speak();
//        tec1_per.teach();  // cant accesses .teach()
        System.out.println(" -- Teacher -> teacher");
        Teacher tec2 = new Teacher(32, "tech 2", "music");
        tec2.speak();
        tec2.teach();

//        Teacher tec4 = new Person(32, "tech 2"); // error

//        must explicitly say this is teacher downcast Person class

        System.out.println("\nupcasting and downscaling teacher class");
        Teacher t = new Teacher(32, "te", "amazing");
        t.speak();
        t.teach();

        Person p = t; // upcast
        p.speak();
//        p.teach() // noy ok

        Teacher t1 = (Teacher) p;
        t1.speak();
        t1.teach();


    }

    // interface
    private static class Dog implements Animal {
        // after implementing interface Animal
        // dog is forced to implement all interface methods
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

        @Override
        public String toStrig() {
            return "i am dog : " + this.name;
        }
    }

    private static void interface_testing() {
        Dog dog1 = new Dog("newDog");
        dog1.sleep();
        dog1.voice();
    }

    private static void generics_tester() {

//        <Generic>  <- this is the generic type og some list obj
        List<Teacher> tech_l = new ArrayList<>();

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        int min = 23;
        int max = 50;

        for (int i = 0; i < 4; i++) {
            tech_l.add(
                    new Teacher(
                            ((int) (Math.random() * (max - min + 1) + min)),
                            generatedString,
                            generatedString
                    ));
            System.out.println(tech_l.get(i) + ", with age: " + tech_l.get(i).get_age());
        }


        //////////////   wild card //////////////


    }


    private static void l() {
//        java print all names
        List<String> names = Arrays.asList("name1", "name2", "name3");
//        names.forEach(s -> System.out.println(s));  // lambda
        names.forEach(System.out::println);  // method reference (CPP style)

    }

}

