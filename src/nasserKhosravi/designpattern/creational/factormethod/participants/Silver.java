package nasserKhosravi.designpattern.creational.factormethod.participants;

/**
 * Created by Naser on 5/9/2017
 */
public class Silver implements Medal {

    @Override
    public void printMessageScore() {
        System.out.println("your score is less than 200 and your medal is "+this.getClass().getSimpleName());
    }
}
