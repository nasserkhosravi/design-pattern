package nasserKhosravi.designpattern.behavioral.mediator.participants;

import java.util.ArrayList;

/**
 * Created by Naser on 5/4/2017
 */
public class MessagePublisher implements IMessageMediator {

    private ArrayList<IColleagueMediator> listColleagues=new ArrayList<>();

    @Override
    public void distributeMessage(IColleagueMediator sender, String msg) {
        for (IColleagueMediator c:listColleagues){
            if (c != sender){
                c.receiveMessage(msg);
            }
        }
    }

    @Override
    public void addColleague(IColleagueMediator aColleague) {
        listColleagues.add(aColleague);
    }

}
