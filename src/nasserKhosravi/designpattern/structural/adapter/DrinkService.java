package nasserKhosravi.designpattern.structural.adapter;

import nasserKhosravi.designpattern.structural.adapter.Participants.ISpecialPerson;

/**
 * Created by Naser on 5/13/2017
 */
public class DrinkService {

    public static String getFreeDrink(ISpecialPerson specialPerson){

        if (specialPerson.getSpecialID() == 1224){
            return "now you have Lemonade";
        }else {
            return "your special Id is not valid";
        }
    }

    public static String getLemonade(int credit){
        if (credit > 99){
            return "Lemonade";
        }else {
            return "your credit is not enough ";
        }
    }
}
