package Design_patterns.builder_pattern;

public class BuilderTest {
    public static void main(String[] args) {

        RobotBuilder oldRobot = new OldRobot();
        RobotBuilder amazingRobot = new AmazingRobot();
        
        RobotEngineer engen1 = new RobotEngineer(oldRobot);
        RobotEngineer engen2 = new RobotEngineer(amazingRobot);

        engen1.makeRobot();
        engen2.makeRobot();

        Robot old1 = engen1.getRobot();
        Robot amaz1 = engen2.getRobot();

        System.out.println("----------old robot created ... ");
        System.out.println(old1);

        System.out.println("\n----------new amazing created ");
        System.out.println(amaz1);
        
        
        System.out.println("tesing");

    }
}
