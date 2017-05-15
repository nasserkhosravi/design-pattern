package nasserKhosravi.designpattern.behavioral.state;

import nasserKhosravi.designpattern.behavioral.state.participants.PersonState;
import nasserKhosravi.designpattern.behavioral.state.participants.states.A_UnBorn;

/**
 * Created by Naser on 5/9/2017
 * we have different state in passage
 * for example {UnBorn , Larva , Child , TeenAge , Young ,Adult , Elderly , Old , Dead}
 * every human pass these state , of course some body does not pass
 * anyway
 * By changing state at run time we can change our behavior
 * Our behavior in this app declared in #ITaskMind , #IMentalMind
 */
public class EntryPointState {

    public static void runExample(){
        PersonState person=new PersonState();

        A_UnBorn unBorn=new A_UnBorn();
        person.setMindState(unBorn);

        printPersonState(person);
        person.beGrower();

        printPersonState(person);
        person.beGrower();

        printPersonState(person);
        person.beGrower();

        printPersonState(person);
        person.beGrower();

        printPersonState(person);
        person.beGrower();

        printPersonState(person);
        person.beGrower();

        printPersonState(person);
        person.beGrower();

        printPersonState(person);
        person.beGrower();

        printPersonState(person);
    }

    private static void printPersonState(PersonState personState){

        printN("How are You: "+personState.howAre());
        printN("What shall you do: "+personState.whatShallDo());
    }

    private static void printN(String s){
        System.out.println(s);
    }

}
