package Design_patterns.Reflection;


import java.lang.reflect.Modifier;

class MyClassReflect {
    private String name;
    private int number;

    private String get_private() {
        return "you cant use this (this is private)";
    }

    private void set_name(String name) {
        this.name = name;

        System.out.println("this is the private set name to ->  " + this.name);
    }
}


public class ReflectCheck {
    public static void main(String[] args) {
        Class reflectClass = MyClassReflect.class;

        String className = reflectClass.getName();
        System.out.println(className);

        int classModifier = reflectClass.getModifiers();
        System.out.println(Modifier.isProtected(classModifier));
        System.out.println("modifier : " + classModifier);

    }
}


