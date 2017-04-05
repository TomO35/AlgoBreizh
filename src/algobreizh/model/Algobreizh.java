/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.model;

import algobreizh.views.Agenda;
import algobreizh.views.Customers;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Algobreizh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("AlgoBreizhAgenda");

        frame.setMinimumSize(new Dimension(1100, 650));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        gbc.gridheight = 1;
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel lagenda = new JLabel("Agenda");
        lagenda.setPreferredSize(new Dimension(60, 40)); 
        frame.add(lagenda, gbc);
        
        gbc.gridheight = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridx = 6;
        JLabel lcustomers = new JLabel("Clients");
        lcustomers.setPreferredSize(new Dimension(60, 40));
        frame.add(lcustomers, gbc);
        
        gbc.gridheight = GridBagConstraints.REMAINDER;
        gbc.gridwidth = 5;
        gbc.gridx = 0;
        gbc.gridy = 1;
        Agenda agenda = new Agenda();
        agenda.setPreferredSize(new Dimension(700, 610));
        frame.add(agenda, gbc);
        
        gbc.gridheight = GridBagConstraints.REMAINDER;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridx = 6;
        Customers customers = new Customers();
        customers.setPreferredSize(new Dimension(500, 610));
        frame.add(customers, gbc);
           
        frame.setEnabled(true);
        frame.setVisible(true);
        
    }
    
}
