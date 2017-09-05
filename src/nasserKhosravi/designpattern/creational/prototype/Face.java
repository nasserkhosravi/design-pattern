package nasserKhosravi.designpattern.creational.prototype;

/**
 * Created by Naser on 5/10/2017
 */
public class Face implements Cloneable {
    public int getCountHair() {
        return countHair;
    }

    public void setCountHair(int countHair) {
        this.countHair = countHair;
    }

    public int getCountBeard() {
        return countBeard;
    }

    public void setCountBeard(int countBeard) {
        this.countBeard = countBeard;
    }

    public int getBeardType() {
        return beardType;
    }

    public void setBeardType(int beardType) {
        this.beardType = beardType;
    }

    public int getTypeLip() {
        return typeLip;
    }

    public void setTypeLip(int typeLip) {
        this.typeLip = typeLip;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    private int countHair;
    private int countBeard;
    private int beardType;
    private int typeLip;
    private String eyeColor;

    public Face(int countHair, int countBeard, int beardType, int typeLip, String eyeColor) {
        this.countHair = countHair;
        this.countBeard = countBeard;
        this.beardType = beardType;
        this.typeLip = typeLip;
        this.eyeColor = eyeColor;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Face(countHair, countBeard, beardType, typeLip, eyeColor);
    }
}
