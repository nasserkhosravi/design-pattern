package nasserKhosravi.designpattern.behavioral.state.participants;

import nasserKhosravi.designpattern.behavioral.state.participants.states.*;

/**
 * Created by Naser on 5/3/2017
 */
public class PersonState implements IMentalMind,ITaskMind{

    private MindState mindState;

    public void beGrower() {

        if (mindState instanceof A_UnBorn){
            mindState = new B_Larva();
        }else if (mindState instanceof B_Larva){
            mindState = new C_Child();
        }else if (mindState instanceof C_Child){
            mindState = new D_TeenAge();
        }else if (mindState instanceof D_TeenAge){
            mindState = new E_Young();
        }else if (mindState instanceof E_Young){
            mindState = new F_Adult();
        }else if (mindState instanceof F_Adult){
            mindState = new G_Elderly();
        }else if (mindState instanceof G_Elderly){
            mindState = new H_Old();
        }else if (mindState instanceof H_Old){
            mindState = new I_Dead();
        }else if (mindState instanceof I_Dead){
            mindState = new A_UnBorn();
        }

        String nameClass = getMindState().getClass().getSimpleName();
        System.out.println();
        System.out.println("You are now " + nameClass.substring(2,nameClass.length())+"\n");


    }

    public MindState getMindState() {
        return mindState;
    }

    public void setMindState(MindState mindState) {
        this.mindState = mindState;
    }

    @Override
    public String howAre() {
        return mindState.howAre();
    }

    @Override
    public String whatShallDo() {
        return mindState.whatShallDo();
    }

}
