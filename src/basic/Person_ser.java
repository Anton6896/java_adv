package basic;

///  class for testing serialization process  ( MUST implements Serializable  )

import java.io.Serializable;

public class Person_ser implements Serializable {
    private static int co = 0;
    private int id;
    private String name;

//    field that stay here not for serialization
    private transient int stay = 43242;

    public Person_ser(String name) {
        id = ++co;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Person_ser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
