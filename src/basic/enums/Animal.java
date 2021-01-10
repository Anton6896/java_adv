package basic.enums;

public enum Animal {
    DOG("i am dog"),
    CAT("i am cat"),
    FROG("i am frog");

    private String info;

    Animal(String info) {
        this.info = info;
    }

    public String get_info() {
        return this.info;
    }

}
