package nasserKhosravi.designpattern.behavioral.mediator;

import nasserKhosravi.designpattern.behavioral.mediator.participants.IColleagueMediator;
import nasserKhosravi.designpattern.behavioral.mediator.participants.MessagePublisher;
import nasserKhosravi.designpattern.behavioral.mediator.participants.MessageSender;

/**
 * Created by Naser on 5/4/2017
 * we can broadcast message in branch(#MessagePublisher) with all memeber(#MessageSender)
 */
public class EntryPointMediator {

    public static void run(){
        IColleagueMediator c1 = new MessageSender("c1");
        IColleagueMediator c2 = new MessageSender("c2");

        IColleagueMediator nasser = new MessageSender("c3");

        IColleagueMediator c4 = new MessageSender("c4");
        IColleagueMediator c5 = new MessageSender("c5");

        MessagePublisher group1 = new MessagePublisher();
        MessagePublisher group2 = new MessagePublisher();

        group1.addColleague(c1);
        group1.addColleague(c2);
        group1.addColleague(nasser);

        group2.addColleague(nasser);
        group2.addColleague(c4);
        group2.addColleague(c5);

        nasser.sendMessage(group1,"hello c1,c2");
        nasser.sendMessage(group2,"hello c4,c5");

        c1.sendMessage(group2,"this message from c1 and all group2 get this message");
    }
}
