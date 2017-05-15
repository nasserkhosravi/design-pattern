package nasserKhosravi.designpattern.behavioral.mediator.participants;

/**
 * Created by Naser on 5/4/2017
 */
public class MessageSender implements IColleagueMediator {

    private String name;

    public MessageSender(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name+" Received message: "+message);
    }

    @Override
    public void sendMessage(IMessageMediator aMediator, String msg) {
        aMediator.distributeMessage(this,msg);
    }
}
