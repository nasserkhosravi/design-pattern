package nasserKhosravi.designpattern.behavioral.chainofresponsility;

/**
 * Created by Naser on 5/12/2017
 *
 * we have a hospital with 3 level of responsibility for patient
 * we must send prior patient and get which part is responsibility
 */
public class EntryPointChainOfResponsibility {

    public static void run() {

        JobBroadCast.doReception(300,"nasser");
        JobBroadCast.doReception(500,"reza");
        JobBroadCast.doReception(900,"soheib");
        JobBroadCast.doReception(1200,"shahab");

    }
}
