package nasserKhosravi.designpattern.structural.flyweight;

import java.util.HashMap;

/**
 * Created by Naser on 5/13/2017
 */
public class TVFactory {

    private static final HashMap<Integer,Tv> map =new HashMap<>();

    public static Tv getTv(int size){
        Tv tv=map.get(size);

        if (tv == null){

            tv=new Tv(size);
            map.put(size,tv);
            System.out.println("new instance");
        }

        return tv;
    }

}
