package nasserKhosravi.designpattern.behavioral.command;

import nasserKhosravi.designpattern.behavioral.command.participants.Macro;
import nasserKhosravi.designpattern.behavioral.command.participants.MultipleCommand;
import nasserKhosravi.designpattern.behavioral.command.participants.SumCommand;

/**
 * Created by Naser on 5/10/2017
 * in this pattern we have some command that we can record them
 * and replay them
 */
public class EntryPointCommand {

    public static void run() {
        Macro macro = new Macro();

        MultipleCommand multiple = new MultipleCommand();
        multiple.setArgs(10, 2);
        multiple.execute();
        macro.addCommand(multiple);

        SumCommand sum = new SumCommand();
        sum.setArgs(2, 3);
        sum.execute();
        macro.addCommand(sum);

//        sum.setArgs(2,5);
//        sum.execute();
//        macro.addCommand(sum);

        System.out.println("you can see result Macro in the following line ");

        macro.executeCommands();
    }

}
