package nasserKhosravi.designpattern.behavioral.state.participants.states;

/**
 * Created by Naser on 5/3/2017.
 */
public abstract class MindState implements IMentalMind,ITaskMind {


    @Override
    abstract public String howAre() ;

    @Override
    abstract public String whatShallDo();


}
