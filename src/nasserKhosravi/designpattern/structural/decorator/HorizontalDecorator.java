package nasserKhosravi.designpattern.structural.decorator;

/**
 * Created by Naser on 8/17/2017
 */
public class HorizontalDecorator extends WindowDecorator {

    public HorizontalDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw in horizontal Decorator");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " plus horizontal Decorator";
    }
}
