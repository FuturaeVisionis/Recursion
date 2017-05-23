package Delta;

import acm.graphics.G3DRect;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by ronald on 27/11/16.
 */
public class Sierpinski extends GraphicsProgram {

    public static void main(String[] args) {
        new Sierpinski().start(args);
    }

    public void run() {
        GRect box = new G3DRect(20, 20, 242, 242);
        box.setFilled(true);
        add(box);

        drawGasket(20, 20, 243);
    }

    public void drawGasket(int x, int y, int side) {
        int sub = side / 3;
        GRect box = new G3DRect(x + sub, y + sub, sub - 1, sub - 1);
        box.setFilled(true);
        box.setColor(Color.GREEN);
        add(box);

        if (sub >= 3) {
            drawGasket(x, y, sub);
            drawGasket(x + sub, y, sub);
            drawGasket(x + 2 * sub, y, sub);
            drawGasket(x, y + sub, sub);
            drawGasket(x + 2 * sub, y + sub, sub);
            drawGasket(x, y + 2 * sub, sub);
            drawGasket(x + sub, y + 2 * sub, sub);
            drawGasket(x + 2 * sub, y + 2 * sub, sub);
        }
    }
}
