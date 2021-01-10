package basic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileUsingClass {
    public static void main(String[] args) {
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
}
