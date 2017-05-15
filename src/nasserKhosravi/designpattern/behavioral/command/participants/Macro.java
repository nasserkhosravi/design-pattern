package nasserKhosravi.designpattern.behavioral.command.participants;

import java.util.ArrayList;

/**
 * Created by Naser on 5/10/2017
 */
public class Macro {

    private ArrayList<ICommand> list=new ArrayList<>();

    public void addCommand(ICommand command){
        list.add(command);
    }

    public ICommand get(int pos){
        return list.get(pos);
    }

    public void executeCommands(){
        list.forEach(ICommand::execute);
    }
}
