package Design_patterns.builder_pattern;

// engineer is tolling to the builder class 
// only builder (RobotBuilder) knows what exactly must be done 

public class RobotEngineer {

    private RobotBuilder robotBuilder;  // <- talk to builder 

    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder; // <- tell to engineer what kind of robot need
    }

    public void makeRobot() { // <- create and hold robot
        this.robotBuilder.builHead();
        this.robotBuilder.builArms();
        this.robotBuilder.builTorso();
        this.robotBuilder.builLegs();
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot(); // <- robotBuilder return Robot
    }

}
