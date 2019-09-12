package LAB5;

import java.applet.Applet;
import java.awt.*;

/* <applet code="AppControls.class" height="350" width="330"></applet> */

public class AppControls extends Applet {
    public void init() {
        Button b = new Button("Test Button");
        this.add(b);

        Checkbox cb = new Checkbox("Test Checkbox");
        this.add(cb);

        CheckboxGroup cbg = new CheckboxGroup();
        this.add(new Checkbox("CB Item 1", cbg, false));
        this.add(new Checkbox("CB Item 2", cbg, false));
        this.add(new Checkbox("CB Item 3", cbg, true));

        Choice choice = new Choice();
        choice.addItem("Choice Item 1");
        choice.addItem("Choice Item 2");
        choice.addItem("Choice Item 3");
        this.add(choice);

        Label l = new Label("Test Label");
        this.add(l);

        TextField t = new TextField("Test TextField", 40);
        this.add(t);

        TextArea textArea = new TextArea("Text Area", 5, 30);
        this.add(textArea);

        List list = new List(5);
        list.add("List item 1");
        list.add("List item 2");
        list.add("List item 3");
        list.add("List item 4");
        list.add("List item 5");
        list.add("List item 6");
        this.add(list);

        showStatus("App is working");
    }

    public void paint(Graphics g) {
        showStatus("App is working");
    }
}
