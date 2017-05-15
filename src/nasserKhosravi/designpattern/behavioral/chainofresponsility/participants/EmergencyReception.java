package nasserKhosravi.designpattern.behavioral.chainofresponsility.participants;

/**
 * Created by Naser on 5/12/2017
 */
public class EmergencyReception implements IApprover{

    @Override
    public void setNextChain(IApprover nextChain) {
        try {
            throw new Exception("it's end of responsibility. you shouldn't call this method");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void dispense(EmergencyRequest request) {
        if (request.getPriorScore() == 800) {
            System.out.println(this.getClass().getSimpleName()+" p1 "+request.getName());
        } else if (request.getPriorScore() == 900){
            System.out.println(this.getClass().getSimpleName()+" p2 "+request.getName());
        }else {
            System.out.println("we can not reception this process go to another hospital");
        }
    }
}
