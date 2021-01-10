package basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileUsingClass {
    public static void main(String[] args) {
//        reading_from();
        writing_to();

    }

    static void reading_from() {
        // get data from file to the list for manipulations
        try {

            // get cwd

            String canonicalPath = new File(".").getCanonicalPath();
            System.out.println("Current directory path using canonical path method :- " + canonicalPath);

            String usingSystemProperty = System.getProperty("user.dir");
            System.out.println("Current directory path using system property:- " + usingSystemProperty);

            // ---------------------------------------------------------


            // open file
            String sep = File.separator;
            File file = new File(canonicalPath + sep + "src" + sep + "basic" + sep + "file.txt");
            Scanner scan = new Scanner(file);
            System.out.println("-- got file ");

            // get data from file to the List
            List<String> text_l = new ArrayList<>();
            int counter = 0;
            while (scan.hasNextLine()) {
                text_l.add(scan.nextLine());
                counter++;
            }
            System.out.format("read all lines %d lines,  done .. \n", counter);

            // manipulation
            System.out.println("test text first line : ");
            System.out.println(text_l.get(0));

            System.out.println("split words from firs line : ");
            String[] words = text_l.get(0).split(" ");
            for (String s : words) {
                System.out.print(s + " | ");
            }

            // close
            scan.close();
            System.out.println("\n-- close file ");


        } catch (IOException e) {
            System.out.println("IOException Occurred" + e.getMessage());
        }
    }

    static void writing_to() {
        try {

            // open / create file
            System.out.println("open file ...");
            String sep = File.separator;
            String canonicalPath = new File(".").getCanonicalPath();
            File file = new File(canonicalPath + sep + "src" + sep + "basic" + sep + "file_wright.txt");

            if (file.createNewFile()) {
                System.out.println("file create : " + file.getName());
            } else {
                System.out.println("already created !");
            }

            // get data
            System.out.println("enter data : ");
            Scanner scan = new Scanner(System.in);
            String data = scan.nextLine();

            // write / append
            FileWriter fw = new FileWriter(file, true);
            fw.write(data + "\n");
            System.out.println("close file ok ..");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
