package Design_patterns.singleton_pattern;

import java.util.List;

public class GetTiles_Runnable implements Runnable {

    @Override
    public void run() {

        Singleton instance = Singleton.getInstance();
        System.out.println("1 id :: " + System.identityHashCode(instance));

        // show all data in list
        System.out.println(instance.getCharList());
        // grub 7 items
        List<Character> list = instance.getTailsList(7);
        System.out.println(" got this : " + list.toString());
    }
}
