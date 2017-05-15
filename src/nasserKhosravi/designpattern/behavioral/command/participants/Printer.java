package nasserKhosravi.designpattern.behavioral.command.participants;

/**
 * Created by Naser on 5/10/2017
 */
public class Printer implements ICommand {

    private String text;

    @Override
    public void execute() {
        System.out.print(getText());
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
