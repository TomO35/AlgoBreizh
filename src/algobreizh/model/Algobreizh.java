/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.model;

import algobreizh.bdd.BddAccess;
import algobreizh.bdd.BddClient;
import java.awt.Dimension;
import java.sql.ResultSet;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Algobreizh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame fenetre = new JFrame("AlgoBreizhAgenda");

        fenetre.setMinimumSize(new Dimension(600, 600));
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        fenetre.setEnabled(true);
        fenetre.setVisible(true);
        
    }
    
}
