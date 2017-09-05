package nasserKhosravi.designpattern.structural.privateClassData;

/**
 * Created by Naser on 9/4/2017.
 */
public class UserModel {
    public String name;
    public String id;

    public UserModel(String name, String id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
