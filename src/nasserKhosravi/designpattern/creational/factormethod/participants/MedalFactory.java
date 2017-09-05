package nasserKhosravi.designpattern.creational.factormethod.participants;

/**
 * Created by Naser on 5/9/2017
 */
public class MedalFactory {

    public static Medal getByScore(final int score){
        if (score<99){
            return new Bronze();
        }else if (score<199){
            return new Silver();
        }else if (score <299){
            return new Gold();
        }
        return null;
    }

}
