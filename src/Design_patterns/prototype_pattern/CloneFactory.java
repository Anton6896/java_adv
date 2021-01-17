package Design_patterns.prototype_pattern;

public class CloneFactory {
    Animal get_clone(Animal sample) {
        return sample.make_copy();  // <- new sheep clone 
    }
}
