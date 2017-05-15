package nasserKhosravi.designpattern.behavioral.chainofresponsility.participants;

/**
 * Created by Naser on 5/12/2017
 */
public class PublicReception implements IApprover{
    private IApprover iApprover;
    @Override
    public void setNextChain(IApprover nextChain) {
        iApprover = nextChain;
    }

    @Override
    public void dispense(EmergencyRequest request) {
        if (request.getPriorScore() == 100){
            System.out.println(this.getClass().getSimpleName()+" p1 "+request.getName());
        }else if (request.getPriorScore() == 200){
            System.out.println(this.getClass().getSimpleName()+" p2 "+request.getName());
        }else if (request.getPriorScore() == 300){
            System.out.println(this.getClass().getSimpleName()+" p3 "+request.getName());
        }else if (request.getPriorScore() == 400){
            System.out.println(this.getClass().getSimpleName()+" p4 "+request.getName());
        }else {
            iApprover.dispense(request);
        }
    }

}