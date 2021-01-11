package Design_patterns.observer_pattern;

// will be list of observers
// user can add/delete observer ,
// and any change in list data will be with notify_observer

public interface Subject {
    void register(Observer o);
    void un_register(Observer o);
    void notify_observer();

}
