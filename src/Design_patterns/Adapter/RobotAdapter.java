package Design_patterns.Adapter;

public class RobotAdapter implements EnemyAttacker {

    AlienRobot robot;

    public RobotAdapter(AlienRobot robot) {
        this.robot = robot;
    }


    @Override
    public void fire_weapon() {
        robot.smash_with_hands();
    }

    @Override
    public void drive_forward() {
        robot.walk();
    }

    @Override
    public void assign_driver(String name) {
        robot.set_name(name);
    }
}
