package nasserKhosravi.designpattern.behavioral.templatemethode;

import nasserKhosravi.designpattern.behavioral.templatemethode.participants.Animal;
import nasserKhosravi.designpattern.behavioral.templatemethode.participants.Bird;
import nasserKhosravi.designpattern.behavioral.templatemethode.participants.Human;

/**
 * Created by Nasser on 5/12/2017
 *
 * All Animal have function
 * {@link Animal#wakeUp()}
 * {@link Animal#eat()}
 * {@link Animal#work()}
 * {@link Animal#sleep()}
 * these function are in unified step
 * But their implementation are differences
 * @See nasserKhosravi.designpattern.behavioral.templatemethode.participants.Animal

 */
public class EntryPointTemplateMethod {


    public static void run() {
        Human human=new Human();
        Bird bird=new Bird();

        human.doCycle();
        System.out.println("");
        bird.doCycle();
    }
}
