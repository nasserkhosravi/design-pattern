package nasserKhosravi.designpattern.behavioral.chainofresponsility.participants;

/**
 * Created by Naser on 5/12/2017
 */
public interface IApprover {

    void setNextChain(IApprover nextChain);
    void dispense(EmergencyRequest request);

}
