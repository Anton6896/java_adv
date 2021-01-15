package Design_patterns.builder_pattern;

// this part is an concept part of any kind of any robots 

public interface RobotConcept {
    void setRobotHead(String newHead);

    void setRobotTorso(String newTorso);

    void setRobotArms(String newHands);

    void setRobotLegs(String newLegs);
}
