package Design_patterns.command_pattern;

public class TvRemote {
    static ElectronicDevice get_device() {
        return new Television();
    }
}
