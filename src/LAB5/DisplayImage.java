package LAB5;
/*
	Display Image in an Applet Example
	This Java example shows how to display an image using drawImage method
	of an Java Graphics class.
*/
import java.applet.Applet;
import java.awt.*;
public class DisplayImage extends Applet
{
    private Image img1;
    public void init(){
        img1 = getImage(getDocumentBase(),"Abhinav.jpg" );
    }
    public void paint(Graphics g){
        //display an image using drawImage method of Graphics class.
        g.drawImage(img1,0,0,10,10,this);
    }
}

/* <applet code = "DisplayImage.class" width = 500 height = 300> </applet> */
