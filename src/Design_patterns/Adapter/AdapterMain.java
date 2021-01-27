package Design_patterns.Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        /*
         * using same interface for different object
         */

        EnemyTank tank = new EnemyTank();
        tank.assign_driver("Mark");
        tank.drive_forward();
        tank.fire_weapon();

        AlienRobot robot = new AlienRobot();
        RobotAdapter robotAdapter = new RobotAdapter(robot);
        robotAdapter.assign_driver("rob1");
        robotAdapter.drive_forward();
        robotAdapter.fire_weapon();

    }
}
