/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.views;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class Agenda extends JPanel {
    
    JButton month, week;
    CardLayout cl = new CardLayout();
    
    public Agenda(){;
        this.setLayout(cl);
        
        Weekly w = new Weekly();
        month = w.getButton();
        month.setText("Voir Mois");
        onClick(month, "month");
        this.add(w,"week");
        
        Monthly s = new Monthly();
        week = w.getButton();
        week.setText("Voir Semaine");
        onClick(week, "week");
        this.add(s,"month");
    }
    
    public void onClick(JButton b, String s){
        MouseAdapter adapteur = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clic(s);
            }
        };
        b.addMouseListener(adapteur);
    }
    
    public void clic(String s) {
        cl.show(Agenda.this, s);
    }

}
