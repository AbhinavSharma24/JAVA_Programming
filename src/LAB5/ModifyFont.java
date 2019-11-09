package LAB5;

import java.applet.Applet;
import java.awt.*;

public class ModifyFont extends Applet {
    private Font f1;
    public void init(){
        f1 = new Font("Comic Sans MS",Font.ITALIC | Font.BOLD, 35);
    }
    public void paint(Graphics g){
        g.setFont(f1);
        g.setColor(Color.black);
        g.drawString("Hello Abhinav!!! Font Modified.", 70, 70);
    }
}

/*
<applet code="FirstApplet.class" height=300 width=300>
</applet>
*/