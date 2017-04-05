/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.views;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Agenda extends JPanel {
    
    JButton month, week;
    ArrayList<String> jours; 
    JLabel lundi, mardi, mercredi, jeudi, vendredi, samedi;
    JLabel mois, semaine;
    
    
    public Agenda(){
        this.jours = new ArrayList<String>("Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi");
        setLayout(new GridLayout(0, 2));
        
        
    }
    
    public void weekly() {
        setLayout(new GridLayout(23, 7));
        
        
    }
    
    public void monthly() {
        setLayout(new GridLayout(6, 7));
        
        
    }
  
}
