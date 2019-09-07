package LAB5;

import java.applet.Applet;
import java.awt.*;

public class LifecycleMethods extends Applet {
    public void init() {
        setBackground(Color.CYAN);
        System.out.println("init() called");
    }
    public void start() {
        System.out.println("start() called");
    }
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Life-Cycle methods called.", 70, 70);
        System.out.println("paint() called");
    }
    public void stop() {
        System.out.println("stop() Called");
    }
    public void destroy() {
        System.out.println("destroy)() Called");
    }
}

/*
<applet code="LifecycleMethods.class" width=350 height=150>
</applet>
*/
