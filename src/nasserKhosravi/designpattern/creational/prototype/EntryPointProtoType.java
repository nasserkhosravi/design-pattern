package nasserKhosravi.designpattern.creational.prototype;

/**
 * Created by Naser on 5/10/2017
 *
 * Assume We have a editor with a face that we want real time see changing
 * so we can use Clone
 */
public class EntryPointProtoType {

    public static void run() {
        Face originalModel=new Face(200,100,1,1,"black");

        try {
            Face templateModel = (Face) originalModel.clone();
            templateModel.setEyeColor("Brown");

            Represent.compareTwoFace(originalModel,templateModel);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
