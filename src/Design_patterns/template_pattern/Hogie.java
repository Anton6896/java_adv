package Design_patterns.template_pattern;

public abstract class Hogie {

    boolean want_meat() {
        return true;
    }

    boolean want_cheese() {
        return true;
    }

    boolean want_vegetables() {
        return true;
    }

    boolean want_condiments() {
        return true;
    }

    abstract void add_meat();

    abstract void add_chase();

    abstract void add_condiments();

    abstract void add_vegetables();

    void cut_bun() {
        System.out.println("the hoagie is cut---");
    }


    void wrap_the_hoagie() {
        System.out.println("wrap the hoagie---");
    }


    final void make_sandwich() {
        cut_bun();

        if (want_meat()) {
            add_meat();
        }

        if (want_cheese()) {
            add_chase();
        }

        if (want_condiments()) {
            add_condiments();
        }
        if (want_vegetables()) {
            add_vegetables();
        }

        wrap_the_hoagie();
    }
}
