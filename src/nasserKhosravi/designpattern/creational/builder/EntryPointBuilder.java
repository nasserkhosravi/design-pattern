package nasserKhosravi.designpattern.creational.builder;

import nasserKhosravi.designpattern.creational.builder.participants.Eye;
import nasserKhosravi.designpattern.creational.builder.participants.Face;
import nasserKhosravi.designpattern.creational.builder.participants.Hair;

/**
 * Created by Naser on 5/9/2017
 * Our {@link Face} have too many parameter
 * for Maintenance and easy managing we can use builder
 */
public class EntryPointBuilder {

    public static void run(){
        Face face=new Face.Builder()
                .setEye(new Eye.Builder().setColor("red").setFocusPower(200).build())
                .setHair(new Hair.Builder().setColor("green").setCount(200).setHeight(200).build())
                .build();

        System.out.println("Eye is{ "+face.getEye()+"}"+" Hair is{ "+face.getHair()+"}");

    }
}
