package Opdracht8_2;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Aantal extends Applet {
    Button Bman, Bvrouw, Lman, Lvrouw;
    int aantal1, aantal2, aantal3, aantal4, totaal;

    public void init() {
        //Bezoekers Man
        Bman = new Button(" + ");
        add(Bman);
        BmanListener bml = new BmanListener();
        Bman.addActionListener( bml );
        //Bezoekers Vrouw
        Bvrouw = new Button(" + ");
        add(Bvrouw);
        BvrouwListener bvl = new BvrouwListener();
        Bvrouw.addActionListener( bvl );
        //Leerling Man
        Lman = new Button(" + ");
        add(Lman);
        LmanListener lml = new LmanListener();
        Lman.addActionListener( lml );
        //Leerling Vrouw
        Lvrouw = new Button(" + ");
        add(Lvrouw);
        LvrouwListener lvl = new LvrouwListener();
        Lvrouw.addActionListener( lvl );

    }

    public void paint(Graphics g) {
        g.drawString("Bezoekers Man " + aantal1 , 20,50);
        g.drawString("Bezoekers Vrouw " + aantal2 , 20,70);
        g.drawString("Potentiële Leerling Man " + aantal3,20,90);
        g.drawString("Potentiële Leerling Vrouw " + aantal4,20,110);
        g.drawString("Totaal aantal " + totaal,20,130);

    }

    class BmanListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            aantal1++;
            totaal++;
            repaint();
        }
    }

    class BvrouwListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            aantal2++;
            totaal++;
            repaint();
        }
    }

    class LmanListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            aantal3++;
            totaal++;
            repaint();
        }
    }

    class LvrouwListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            aantal4++;
            totaal++;
            repaint();
        }
    }


}
