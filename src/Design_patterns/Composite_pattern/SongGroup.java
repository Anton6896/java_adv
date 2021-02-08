package Design_patterns.Composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class SongGroup extends SongComponent {
    List<SongComponent> componentList = new ArrayList<>();

    String groupName;
    String groupDescription;

    public SongGroup(String newName, String newDescript) {
        groupName = newName;
        groupDescription = newDescript;
    }

    String getGroupName() {
        return groupName;
    }

    String getGroupDescription() {
        return groupDescription;
    }

    void add(SongComponent component) {
        componentList.add(component);
    }

    void remove(SongComponent component) {
        componentList.remove(component);
    }

    SongComponent getSong(int idx) {
        return componentList.get(idx);
    }

    void display() {
        System.out.println(getGroupName() + " " + getGroupDescription());

        for (SongComponent song : componentList) {
            song.display();
        }
    }

}
