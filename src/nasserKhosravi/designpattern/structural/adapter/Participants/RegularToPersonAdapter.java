package nasserKhosravi.designpattern.structural.adapter.Participants;

/**
 * Created by Naser on 5/13/2017.
 */
public class RegularToPersonAdapter implements ISpecialPerson{

    private RegularPerson regularPerson;

    public RegularToPersonAdapter(RegularPerson regularPerson) {
        this.regularPerson = regularPerson;
    }

    @Override
    public int getSpecialID() {
        return 1224;
    }
}
