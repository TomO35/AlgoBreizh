/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.views;

import algobreizh.bdd.BddClient;
import algobreizh.model.Customer;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Customers extends JPanel {
    
    ArrayList<Customer> customers;
    
    public Customers(){
        
        JScrollPane scrollPane = new JScrollPane(this);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        
        customers = new BddClient().getCustomers();
        
        for (int i = 0; i < customers.size(); i++){
            add(new CustomerView(customers.get(i)));
        }
        
    }
    
}
