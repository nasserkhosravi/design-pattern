package nasserKhosravi.designpattern.creational.prototype;

/**
 * Created by Naser on 5/10/2017
 *
 */
public class Represent {


    public static void compareTwoFace(Face one,Face two){
        System.out.println("Beard type: "+one.getBeardType()+" "+two.getBeardType());
        System.out.println("Count beard: "+one.getCountBeard()+" "+two.getCountBeard());
        System.out.println("Count hair: "+one.getCountHair()+" "+two.getCountHair());
        System.out.println("Type lip: "+one.getTypeLip()+" "+two.getTypeLip());
        System.out.println("Eye color: "+one.getEyeColor()+" "+two.getEyeColor());
    }
}
