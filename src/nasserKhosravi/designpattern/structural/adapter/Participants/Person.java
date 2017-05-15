package nasserKhosravi.designpattern.structural.adapter.Participants;

/**
 * Created by Naser on 5/13/2017
 */
public abstract class Person {

    private final String name;
    private final String family;


    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }
}
