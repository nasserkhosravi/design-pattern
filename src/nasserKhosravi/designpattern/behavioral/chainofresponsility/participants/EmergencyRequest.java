package nasserKhosravi.designpattern.behavioral.chainofresponsility.participants;

/**
 * Created by Naser on 5/12/201
 */
public class EmergencyRequest {
    private String name;
    private int priorScore;

    public EmergencyRequest(String name, int priorScore) {
        this.name = name;
        this.priorScore = priorScore;
    }

    public int getPriorScore() {
        return priorScore;
    }

    public String getName() {

        return name;
    }
}
