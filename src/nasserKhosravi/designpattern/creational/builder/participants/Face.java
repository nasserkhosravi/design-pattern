package nasserKhosravi.designpattern.creational.builder.participants;

/**
 * Created by Naser on 5/9/2017
 */
public class Face {

    private final Eye eye;
    private final Hair hair;

    private Face(Eye eye, Hair hair){

        this.eye = eye;
        this.hair = hair;
    }

    public Eye getEye() {
        return eye;
    }

    public Hair getHair() {
        return hair;
    }


    public static class Builder{

        private Eye eye;
        private Hair hair;

        public Builder setEye(Eye eye){
            this.eye = eye;

            return this;
        }

        public Builder setHair(Hair hair){
            this.hair = hair;

            return this;
        }

        public Face build(){
            return new Face(eye,hair);
        }

    }

}
