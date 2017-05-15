package nasserKhosravi.designpattern.structural.composite;



/**
 * Created by Naser on 4/30/2017.
 */

public class MyFile {
    public static final int DIR = 0;
    public static final int TEXT_FILE = 1;

    private final String fileName;
    private final int type;

    public MyFile(String fileName, @SupportFile int type) {
        this.fileName = fileName;
        this.type = type;
    }

    public String getFileName() {
        return fileName;
    }

    public int getType() {
        return type;
    }


    @IntDef({DIR,TEXT_FILE})
    @interface SupportFile {}

}
