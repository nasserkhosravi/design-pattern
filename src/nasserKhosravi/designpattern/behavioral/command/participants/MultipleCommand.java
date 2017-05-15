package nasserKhosravi.designpattern.behavioral.command.participants;

/**
 * Created by Naser on 5/10/2017
 */
public class MultipleCommand implements ICommand{
    private int result;
    private int x;
    private int y;

    public void setArgs(int x,int y){

        this.x = x;
        this.y = y;
    }
    public int getResult(){
        return result;
    }

    @Override
    public void execute() {
        result = x * y;
        System.out.println("Result: "+"x * y = "+result);
    }
}
