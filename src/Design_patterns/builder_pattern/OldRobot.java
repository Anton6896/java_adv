package Design_patterns.builder_pattern;

// depend on concept of how object
// (must be look like) creating an concrete class (old robot)

public class OldRobot implements RobotBuilder {

    private Robot robot; 

    public OldRobot() {
        // initialize new concrete robot from concept
        this.robot = new Robot();
    }

    @Override
    public void builHead() {
        robot.setRobotHead("Old one ");

    }

    @Override
    public void builTorso() {
        robot.setRobotTorso("old robot torso");
    }

    @Override
    public void builArms() {
        robot.setRobotArms("old arms ");

    }

    @Override
    public void builLegs() {
        robot.setRobotLegs("old legs");

    }

    @Override
    public Robot getRobot() {
        return this.robot;  // <- return concrete robot with this param 
    }

}
