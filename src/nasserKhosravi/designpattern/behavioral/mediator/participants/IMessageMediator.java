package nasserKhosravi.designpattern.behavioral.mediator.participants;


/**
 * Created by Naser on 5/4/2017
 */
public interface IMessageMediator {

    void distributeMessage(IColleagueMediator sender, String msg);
    void addColleague(IColleagueMediator aColleague);
}
