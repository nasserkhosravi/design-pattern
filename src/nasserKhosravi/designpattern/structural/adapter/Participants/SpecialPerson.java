package nasserKhosravi.designpattern.structural.adapter.Participants;

/**
 * Created by Naser on 5/13/2017.
 */
public class SpecialPerson extends Person implements ISpecialPerson{

    public SpecialPerson(String name, String family) {
        super(name, family);
    }

    @Override
    public int getSpecialID() {
        return 1224;
    }
}
