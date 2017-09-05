package nasserKhosravi.designpattern.structural.privateClassData;

/**
 * Created by Naser on 9/4/2017
 */
public class User {

    private UserModel model;

    public User(final String id, final String name) {
        this.model = new UserModel(name, id);
    }

    public void printUserName() {
        System.out.println(model.getName());
    }

    public void printUserId() {
        System.out.println(model.getId());
    }

}
