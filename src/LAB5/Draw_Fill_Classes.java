package LAB5;

import java.applet.Applet;
import java.awt.*;

public class Draw_Fill_Classes extends Applet {
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);

        g.drawLine(30, 30, 200, 100);

        g.drawRect(250, 30, 200, 100);
        g.fillRect(250, 30, 200, 100);
        g.drawRoundRect(30, 150, 200, 100,80,80);
        g.fillRoundRect(30, 150, 200, 100,80,80);

        g.drawOval(250, 150, 200, 100);
        g.fillOval(250, 150, 200, 100);

        int[] x = {50, 70, 80, 90, 150, 180};
        int[] y = {400, 370, 310, 300, 290, 270};
        int numberOfPoints = 6;
        g.drawPolygon(x, y, numberOfPoints);
        g.fillPolygon(x, y, numberOfPoints);
    }
}

/*
<applet code="LifecycleMethods.class" width=300 height=300>
</applet>
*/