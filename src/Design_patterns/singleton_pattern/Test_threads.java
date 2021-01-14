package Design_patterns.singleton_pattern;

public class Test_threads {
    public static void main(String[] args) {
        // 2 threads getting same singleton class
        Runnable getTiles_1 = new GetTiles_Runnable();
        Runnable getTiler_2 = new GetTiles_Runnable();

        new Thread(getTiles_1).start();
        new Thread(getTiler_2).start();
    }
}
