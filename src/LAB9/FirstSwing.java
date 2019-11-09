package LAB9;

import javax.swing.*;

public class FirstSwing {
    public static void main(String[] args)  {
        JFrame f=new JFrame();
        JButton b=new JButton("Click here!");
        JTextField tf=new JTextField();
        tf.setBounds(10,10,200,40);
        b.setBounds(210,10,100,40);
        f.add(b);                           //adding button to frame
        f.add(tf);                          //adding textfield to frame
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

