package Design_patterns.builder_pattern;

/**
 * create and more specific blueprint from an robot concept !
 * 
 */

public class Robot implements RobotConcept {

    private String roboHead;
    private String roboTorso;
    private String roboArms;
    private String roboLegs;

    @Override
    public void setRobotHead(String newHead) {
        roboHead = newHead;

    }

    @Override
    public void setRobotTorso(String newTorso) {
        roboTorso = newTorso;

    }

    @Override
    public void setRobotArms(String newHands) {
        roboArms = newHands;

    }

    @Override
    public void setRobotLegs(String newLegs) {
        roboLegs = newLegs;

    }

    // getters
    public String getRoboHead() {
        return roboHead;
    }

    public String getRoboArms() {
        return roboArms;
    }

    public String getRoboTorso() {
        return roboTorso;
    }

    public String getRoboLegs() {
        return roboLegs;
    }

    
    @Override
    public String toString() {
        return "Robot Head is " + roboHead + " this robot have an " + roboTorso;
    }

}
