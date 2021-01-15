package Design_patterns.builder_pattern;


// this one tells to any class that want to create an robot what must be done 

public interface RobotBuilder {
    void builHead();
    void builTorso();
    void builArms();
    void builLegs();
    Robot getRobot();
    
}
