/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.views;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Monthly extends JPanel {
    
    JButton button;
    
    public Monthly() {
        setLayout(new GridLayout(0, 7));
        
        String[] jours = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi"};
        
        button = new JButton("Semaine");
        add(button);
        
        for (int i = 0; i < 6; i++) {
            JLabel jour = new JLabel(jours[i]);
            jour.setHorizontalAlignment(JLabel.CENTER);
            add(jour);
        }
         
    }
    
    public JButton getButton(){
        return button;
    }
    
}
