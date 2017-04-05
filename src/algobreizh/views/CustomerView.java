/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.views;

import algobreizh.model.Customer;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CustomerView extends JPanel {
    
    JLabel company, city, name, firstname, phone, dateLastMeeting, note;
    JTextField fnote;
    JButton modif, meeting;
    BorderLayout bl;
    
    public CustomerView(Customer c){
        bl = new BorderLayout();
        setLayout(bl);
        
        JPanel up = new JPanel();
        company = new JLabel(c.getCompany());
        up.add(company,"WEST");
        city = new JLabel(c.getCity());
        up.add(city,"CENTER");
        meeting = new JButton("Prendre RDV");
        up.add(meeting,"EAST");
        
        add(up,"NORTH");
        
        JPanel center = new JPanel();
        name = new JLabel(c.getName());
        center.add(name,"WEST");
        firstname = new JLabel(c.getFirstname());
        center.add(firstname,"CENTER");
        phone = new JLabel(String.valueOf(c.getPhone()));
        center.add(phone,"EAST");
        
        add(center,"CENTER");
        
        JPanel center2 = new JPanel();
        dateLastMeeting = new JLabel(c.getCity());
        center2.add(dateLastMeeting,"WEST");
        modif = new JButton("Modifier");
        center2.add(modif,"EAST");
        
        add(center2,"SOUTH");
        
        
        note = new JLabel(c.getCity());
        fnote = new JTextField();
        
        
        MouseAdapter adMod = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modif();
            }
        };
        modif.addMouseListener(adMod);
        
        MouseAdapter adMeet = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                meeting();
            }
        };
        meeting.addMouseListener(adMeet);
        
        
    }
    
   
    
    public void modif(){
        
    }
    
    public void meeting(){
        
    }
    
}
