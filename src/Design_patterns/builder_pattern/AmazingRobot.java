package Design_patterns.builder_pattern;

public class AmazingRobot implements RobotBuilder {

    Robot robot;

    public AmazingRobot() {
        robot = new Robot(); // <- create object from blue print
    }

    @Override
    public void builHead() {
        robot.setRobotHead("terrific new Head");

    }

    @Override
    public void builTorso() {
        robot.setRobotTorso("terrific new torso");

    }

    @Override
    public void builArms() {
        robot.setRobotArms("terrific new Arms");

    }

    @Override
    public void builLegs() {
        robot.setRobotLegs("terrific new Legs");

    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }

}
