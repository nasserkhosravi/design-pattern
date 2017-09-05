package nasserKhosravi.designpattern.structural.privateClassData;

/**
 * Created by Naser on 9/4/2017.
 */
public class EntryPointPrivateClassData {

    public static void run(){
        User user=new User("42","nasser");
        user.printUserId();
        user.printUserName();
    }
}
