package Design_patterns.command_pattern;

// commands that an device cen perform

public interface Command {
    void execute();
    void undo();
}
