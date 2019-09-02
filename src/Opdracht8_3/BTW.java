package Opdracht8_3;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BTW extends Applet {
    TextField tekstvak;
    Label label;
    Button ok;
    double btw;

    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("Prijs met BTW berekenen");
        tekstvak.addActionListener( new TekstvakListener() );
        //Ok button
        ok = new Button("Ok");
        OkListener ol = new OkListener();
        ok.addActionListener( ol );
        add(label);
        add(tekstvak);
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString("Totaal € " + btw , 20,50);
    }

    class OkListener implements ActionListener {
        public void actionPerformed( ActionEvent e){
            String s = tekstvak.getText();
            btw = Double.parseDouble( s );
            btw = btw * 1.21;
            repaint();
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            btw = Double.parseDouble( s );
            repaint();
        }
    }
}
