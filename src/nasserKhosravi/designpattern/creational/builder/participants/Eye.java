package nasserKhosravi.designpattern.creational.builder.participants;

/**
 * Created by Naser on 5/9/2017
 */
public class Eye {

    private String color;
    private int focusPower;

    private Eye(String color,int focusPower){
        this.color = color;
        this.focusPower = focusPower;
    }

    public String getColor() {
        return color;
    }

    public int getFocusPower() {
        return focusPower;
    }

    public static class Builder{

        private String color;
        private int focusPower;

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Builder setFocusPower(int focusPower){
            this.focusPower = focusPower;
            return this;
        }

        public Eye build(){
            return new Eye(color,focusPower);
        }
    }


    @Override
    public String toString() {
        return "Color : "+getColor()+", Focus Power: "+getFocusPower()+". ";
    }
}
