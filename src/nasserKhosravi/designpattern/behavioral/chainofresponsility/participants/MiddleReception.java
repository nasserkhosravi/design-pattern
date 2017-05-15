package nasserKhosravi.designpattern.behavioral.chainofresponsility.participants;

/**
 * Created by Naser on 5/12/2017
 */
public class MiddleReception implements IApprover {

    private IApprover iApprover;

    @Override
    public void setNextChain(IApprover nextChain) {
        iApprover = nextChain;
    }

    @Override
    public void dispense(EmergencyRequest request) {
        if (request.getPriorScore() == 500){
            System.out.println(this.getClass().getSimpleName()+" p1 "+request.getName());
        }else if (request.getPriorScore() == 600){
            System.out.println(this.getClass().getSimpleName()+" p2 "+request.getName());
        }else if (request.getPriorScore() == 700){
            System.out.println(this.getClass().getSimpleName()+" p3 "+request.getName());
        }else {
            iApprover.dispense(request);
        }
    }
}
