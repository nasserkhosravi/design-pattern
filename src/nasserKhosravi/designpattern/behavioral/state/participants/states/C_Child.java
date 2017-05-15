package nasserKhosravi.designpattern.behavioral.state.participants.states;

/**
 * Created by Naser on 5/3/2017.
 */
public class C_Child extends MindState{

    @Override
    public String howAre() {
        return "mom is good father is angry ." +
                "for now i am bad because i have not any tiny";
    }

    @Override
    public String whatShallDo() {
        return "i should just play game";
    }
}
