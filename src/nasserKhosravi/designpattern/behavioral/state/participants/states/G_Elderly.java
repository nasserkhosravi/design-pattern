package nasserKhosravi.designpattern.behavioral.state.participants.states;

/**
 * Created by Naser on 5/3/2017.
 */
public class G_Elderly extends MindState{

    @Override
    public String howAre() {
        return "I'm good with a little tire";
    }

    @Override
    public String whatShallDo() {
        return "SnapShotHolder music family and old friend is your best friend";
    }
}
