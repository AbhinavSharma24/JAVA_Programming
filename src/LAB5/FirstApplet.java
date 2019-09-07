package LAB5;

import java.applet.Applet;
import java.awt.*;

public class FirstApplet extends Applet {
    private Font f1;
    public void init(){
        setBackground(Color.yellow);
        f1 = new Font("Arial",Font.BOLD, 25);
    }
    public void paint(Graphics g){
        g.setFont(f1);
        g.setColor(Color.red);
        g.drawString("Hello Abhinav", 70, 70);
    }
}

/*
<applet code = "FirstApplet.class" height = 300 width = 300>
</applet>
 */
