package basic;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class SerializingFileMy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        creating file to work with
        String sep = File.separator;
        String path_ = new File(".").getCanonicalPath();
        File file = new File(path_ + sep + "src" + sep + "basic" + sep + "people.bin");

        if (file.createNewFile()) {
            System.out.println("file create : " + file.getName());
        } else {
            System.out.println("file already created !");
        }


//        working with data
        List<Person_ser> bpl = new LinkedList<>();  // get data from file (empty)
        List<Person_ser> pl = new LinkedList<>(); // data in

        pl.add(new Person_ser("person 1"));
        pl.add(new Person_ser("person 2"));
        System.out.println("have an array : \n" + pl);


//        serialize_me(file, pl);
//        de_serialize_me(file, bpl);
        serialize_list_of_data(file, pl);
        de_serialize_list(file, bpl);


    }


    static void serialize_me(File file, List<Person_ser> list) throws IOException {
//        put data to file as bin

        Person_ser p1 = new Person_ser("name 1");
        Person_ser p2 = new Person_ser("name 2");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("-- serialization start ");
        for (Person_ser p : list) {
            oos.writeObject(p);
        }
        oos.close();
        System.out.println("-- serialization complete ");
    }

    static void de_serialize_me(File file, List<Person_ser> list) throws IOException, ClassNotFoundException {
//        get data from bin file as Person_ser class

        System.out.println("\n === open and getting data ... ");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

//        while (ois.available() > 0) {
//            list.add((Person_ser) ois.readObject());
//        }

        list.add((Person_ser) ois.readObject());
        list.add((Person_ser) ois.readObject());

        ois.close();
        System.out.println(" === got all obj , file closed\n");
        System.out.println("got this data : \n" + list);
    }

    static void serialize_list_of_data(File file, List<?> list) throws IOException {
//        using wild card for serialization , writing objects in bin file

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("wright start");
        oos.writeInt(list.size()); // how many objects writen
        for (Object p : list) {
            oos.writeObject(p);   // write
        }
        oos.close();
        System.out.println("write done");
    }

    static void de_serialize_list(File file, List<Person_ser> list) throws IOException, ClassNotFoundException {
        System.out.println("\n=== open file");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        int amount = ois.readInt();
        for (int i = 0; i < amount; i++) {
            list.add((Person_ser) ois.readObject());
        }

        ois.close();
        System.out.println("=== close file");
        System.out.println("\ngot data : \n" + list);
    }


}

