package LAB9;

import javax.swing.*;

public class TableExample {
    JFrame f;
    JTable j;
    private TableExample() {
        f = new JFrame();
        f.setTitle("TableExample");
        String[][] data = {
                {
                    "Abhinav", "2499", "B.Tech"}, {
                    "Aditi", "4501", "B.Com."}
        };
        String []columnNames={"Name","Roll No","Course"};
        j=new JTable(data,columnNames);
        j.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(j);
        f.add(sp);
        f.setSize(500,200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}

