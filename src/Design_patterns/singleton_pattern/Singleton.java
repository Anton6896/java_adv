package Design_patterns.singleton_pattern;

import java.util.*;

public class Singleton {
    private static Singleton firstInstance = null;
    private List<Character> letters = new LinkedList<>();

    private void my_chars() {
        for (int i = 65, j = 97; i < 90; i++, j++) {
            letters.add((char) i);
            letters.add((char) j);
        }
    }

    static boolean firstThread = true;

    private Singleton(){}

    public static Singleton getInstance(){

        if (firstInstance == null) {

            if (firstThread) {
                firstThread = false;

                try {
                    Thread.currentThread();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // dont allow to enter other thread till this not finished job
            synchronized (Singleton.class) {
                if (firstInstance == null) {
                    firstInstance = new Singleton();

                    // shuffle all characters in List
                    Collections.shuffle(firstInstance.letters);
                }
            }
        }

        return firstInstance;
    }

    List<Character> getCharList() {
        return firstInstance.letters;
    }

    List<Character> getTailsList(int howMany) {
        List<Character> tailsList = new LinkedList<>();
        for (int i = 0; i < howMany; i++) {
            // return firs element and move list left
            tailsList.add(firstInstance.letters.remove(0));
        }
        return tailsList;
    }
}
