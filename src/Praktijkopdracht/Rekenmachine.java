package Praktijkopdracht;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Rekenmachine extends Applet {
    TextField tekstvak1, tekstvak2;
    Button keer, deel, plus, min;
    double antwoord1, antwoord2, totaal1;
    String reset;

    public void init() {
        tekstvak1 = new TextField("",20);
        tekstvak2 = new TextField("",20);
        reset = "";
        //Keer knop
        keer = new Button("*");
        KeerListener kl = new KeerListener();
        keer.addActionListener( kl );
        //Deel knop
        deel = new Button("/");
        DeelListener dl = new DeelListener();
        deel.addActionListener( dl );
        //Plus knop
        plus = new Button("+");
        PlusListener pl = new PlusListener();
        plus.addActionListener( pl );
        //Min knop
        min = new Button("-");
        MinListener ml = new MinListener();
        min.addActionListener( ml );
        //Toevoegen
        add(tekstvak1);
        add(tekstvak2);
        add(keer);
        add(deel);
        add(plus);
        add(min);
    }

    public void paint(Graphics g) {
    }

    class KeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            antwoord1 = Double.parseDouble( s1 );
            String s2 = tekstvak2.getText();
            antwoord2 = Double.parseDouble( s2 );
            totaal1 = antwoord1 * antwoord2;
            tekstvak1.setText(String.valueOf(totaal1));
            tekstvak2.setText(reset);
            repaint();
        }

    }

    class DeelListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            String s1 = tekstvak1.getText();
            antwoord1 = Double.parseDouble( s1 );
            String s2 = tekstvak2.getText();
            antwoord2 = Double.parseDouble( s2 );
            totaal1 = antwoord1 / antwoord2;
            tekstvak1.setText(String.valueOf(totaal1));
            tekstvak2.setText(reset);
        }
    }

    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            antwoord1 = Double.parseDouble( s1 );
            String s2 = tekstvak2.getText();
            antwoord2 = Double.parseDouble( s2 );
            totaal1 = antwoord1 + antwoord2;
            tekstvak1.setText(String.valueOf(totaal1));
            tekstvak2.setText(reset);
        }
    }

    class MinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            antwoord1 = Double.parseDouble( s1 );
            String s2 = tekstvak2.getText();
            antwoord2 = Double.parseDouble( s2 );
            totaal1 = antwoord1 - antwoord2;
            tekstvak1.setText(String.valueOf(totaal1));
            tekstvak2.setText(reset);
        }
    }
}
