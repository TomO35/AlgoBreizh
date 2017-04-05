/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.views;

import java.awt.GridBagConstraints;
import static java.awt.GridBagConstraints.CENTER;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Weekly extends JPanel {
    
    JButton button;
    
    public Weekly() {
        setLayout(new GridBagLayout());
        
        String[] jours = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi"};
        
        button = new JButton("Semaine");
        add(button);
        
        JPanel jour = new JPanel();
        jour.setLayout(new GridLayout(0,6));
        for (int i = 0; i < 6; i++) {
            JLabel label = new JLabel(jours[i]);
            label.setHorizontalAlignment(JLabel.CENTER);
            jour.add(label);
        }
        
        JPanel numWeek = new JPanel();
        numWeek.setLayout(new GridLayout(6,0));
        for (int i = 0; i < 5; i++) {
            JLabel label = new JLabel("Semaine " + i);
            label.setHorizontalAlignment(JLabel.CENTER);
            numWeek.add(label);
        }
        
        JPanel planning = new JPanel();
        planning.setLayout(new GridLayout(0, 6));
        for (int i = 0; i < 30; i++) {
            JLabel label = new JLabel("Jour " + (i+1));
            label.setHorizontalAlignment(JLabel.CENTER);
            planning.add(label);
        }
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.anchor = CENTER;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(button, gbc);
        
        gbc.gridx = 1;
        add(jour, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(numWeek, gbc);
        
        gbc.gridx = 1;
        add(planning, gbc);        
       
    }
    
    public JButton getButton(){
        return button;
    }
    
}
