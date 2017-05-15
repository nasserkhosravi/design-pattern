package nasserKhosravi.designpattern.behavioral.mediator.participants;

/**
 * Created by Naser on 5/4/2017
 */
public interface IColleagueMediator {

    void receiveMessage(String message);
    void sendMessage(IMessageMediator aMediator, String msg);
}
