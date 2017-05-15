package nasserKhosravi.designpattern.creational.builder.participants;

/**
 * Created by Naser on 5/9/2017
 */
public class Hair {

    private final String color;
    private final int count;
    private final int height;

    private Hair(String color, int count, int height){

        this.color = color;
        this.count = count;
        this.height = height;
    }


    public String getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }

    public int getHeight() {
        return height;
    }

    public static class Builder{

        private String color;
        private int count;
        private int height;

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Hair build(){
            return new Hair(color,count,height);
        }
    }


    @Override
    public String toString() {
        return "Color : "+getColor()+", Count: "+getCount()+", Height: "+getHeight()+". ";
    }

}
