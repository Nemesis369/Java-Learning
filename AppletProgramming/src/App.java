package AppletProgramming.src;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class App extends Applet {

    public void init() {
        resize(100, 100);
        setBackground(Color.YELLOW);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello World", 150, 150);
        g.drawString("This is an applet", 50, 50);
    }
}
