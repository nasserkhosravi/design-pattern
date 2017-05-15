package nasserKhosravi.designpattern.creational.factormethod.participants;

/**
 * Created by Naser on 5/9/2017
 */
public class Bronze implements Medal {

    @Override
    public void printMessageScore() {
        System.out.println("your score is less than 100 and your medal is "+this.getClass().getSimpleName());
    }
}
