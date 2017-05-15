package nasserKhosravi.designpattern.behavioral.state.participants.states;

/**
 * Created by Naser on 5/3/2017.
 */
public class F_Adult extends MindState{
    @Override
    public String howAre() {
        return "Life is good ,i spend my time with my love , family and job but unfortunately my time is so little and i'm busy";
    }

    @Override
    public String whatShallDo() {
        return "I should take the world";
    }
}
