package nasserKhosravi.designpattern.behavioral.chainofresponsility;

import nasserKhosravi.designpattern.behavioral.chainofresponsility.participants.*;

/**
 * Created by Naser on 5/12/2017
 */
class JobBroadCast {

    static void doReception(int priorScore, String name){

        IApprover publicRe= new PublicReception();
        IApprover middleRe=new MiddleReception();
        IApprover emergencyReception=new EmergencyReception();

        publicRe.setNextChain(middleRe);
        middleRe.setNextChain(emergencyReception);

        publicRe.dispense(new EmergencyRequest(name,priorScore));

    }

}
