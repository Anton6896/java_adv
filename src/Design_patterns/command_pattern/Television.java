package Design_patterns.command_pattern;

// some actual device

public class Television implements ElectronicDevice {
    private int volume = 10;
    private String name;

    public void set_name(String new_name) {
        name = new_name;
    }

    @Override
    public String toString() {
        return "Television{" +
                ", name=" + name +
                '}';
    }

    @Override
    public void on() {
        System.out.println("tv is on");
    }

    @Override
    public void off() {
        System.out.println("tv is off");

    }

    @Override
    public void volume_up() {
        System.out.println("tv volume upp " + (++volume));

    }

    @Override
    public void volume_down() {
        System.out.println("tv volume down " + (--volume));

    }
}
