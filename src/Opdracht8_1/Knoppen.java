package Opdracht8_1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knoppen extends Applet {
    TextField tekstvak;
    Label label;
    Button ok;
    Button reset;
    String text;

    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("Type iets zinnigs in dit vakje");
        //Ok button
        ok = new Button("Ok");
        OkListener ol = new OkListener();
        ok.addActionListener( ol );
        //Reset button
        reset = new Button("Reset");
        ResetListener rl = new ResetListener();
        reset.addActionListener( rl );
        //Buttons
        add(label);
        add(tekstvak);
        add(ok);
        add(reset);
    }

    public void  paint(Graphics g) {
        g.drawString(text,50,50);
    }

    class OkListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            text = tekstvak.getText();
            repaint();
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            text = "";
            repaint();
        }
    }
}
