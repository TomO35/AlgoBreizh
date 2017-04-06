/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.bdd;

import algobreizh.model.Customer;
import algobreizh.model.Meeting;
import algobreizh.model.Seller;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

public class BddClient {
    
    public void createCustomer(Customer c){
        String querry = "INSERT INTO client VALUES (\'" + c.getName() 
                + "\',\'" + c.getFirstname() + "\',\'" + c.getCompany()
                + "\',\'" + c.getAddress() + "\',\'" + c.getCp()
                + "\',\'" + c.getCity() + "\')";
        BddAccess.execute(querry);
    }
    
    public void modifyCustomer(Customer c){
        String querry = "UPDATE client SET (name = \'" + c.getName() 
                + "\', firstname = \'" + c.getFirstname()
                + "\', company = \'" + c.getCompany()
                + "\', address = \'" + c.getAddress()
                + "\', cp = \'" + c.getCp()
                + "\', city = \'" + c.getCity() + "\')";
        BddAccess.execute(querry);
    }
    
    public void createMeeting(Meeting m){
        String querry = "INSERT INTO meeting VALUES (\'" + m.getDate()
                + "\',\'" + m.getHour()
                + "\',\'" + m.getCustomer().getId()
                + "\',\'" + m.getSeller().getId()
                + "\',\'" + m.getInfo() + "\')";
        BddAccess.execute(querry);
    }
    
    public ArrayList<Meeting> getMeetings(Seller s){
        ArrayList<Meeting> meetings = new ArrayList<>();
        String querry = "SELECT * FROM meeting WHERE id_seller = " + s.getId();
        ResultSet res = BddAccess.execute(querry);
        if (res != null) {
            try {
		while (res.next()) {
                    int id = res.getInt("id_meeting");
                    Date date = res.getDate("date_meeting");
                    Time hour = res.getTime("hour_meeting");
                    int id_customer = res.getInt("id_customer");
                    Customer customer = getCustomer(id_customer);
                    int id_seller = res.getInt("id_seller");
                    Seller seller = getSeller(id_seller);
                    String info = res.getString("info");
                    meetings.add(new Meeting(id,date,hour,customer,seller,info));
		}
            } catch (SQLException e) {
            }
        }
        return meetings;
    }
    
    public ArrayList<Customer> getCustomers(){
        ArrayList<Customer> customers = new ArrayList<>();
        String querry = "SELECT * FROM client";
        ResultSet res = BddAccess.execute(querry);
        if (res != null) {
            try {
		while (res.next()) {
                    int id = res.getInt("id_client");
                    String name = res.getString("name");
                    String firstname = res.getString("firstname");
                    int phone = res.getInt("phone");
                    String email = res.getString("email");
                    String company = res.getString("society");
                    String address = res.getString("address");
                    String cp = res.getString("CP");
                    String ville = res.getString("city");
                    customers.add(new Customer(id,name,firstname,phone,email,company,address,cp,ville));
		}
            } catch (SQLException e) {
                System.out.println("Problem Récupération Client : " + e);
            }
        }
        
        return customers;
    }
    
    public Customer getCustomer(int id){
        String querry = "SELECT * FROM client WHERE id_client = " + id;
        Customer customer = new Customer();
        ResultSet res = BddAccess.execute(querry);
        if (res != null) {
            try {
		while (res.next()) {
                    String name = res.getString("name");
                    String firstname = res.getString("firstname");
                    int phone = res.getInt("phone");
                    String email = res.getString("email");
                    String company = res.getString("society");
                    String address = res.getString("address");
                    String cp = res.getString("CP");
                    String ville = res.getString("city");
                    customer = new Customer(id,name,firstname,phone,email,company,address,cp,ville);
		}
            } catch (SQLException e) {
            }
        }
        return customer;
    }
    
    public Seller getSeller(int id){
        String querry = "SELECT * FROM seller WHERE id_seller = " + id;
        Seller seller = new Seller();
        ResultSet res = BddAccess.execute(querry);
        if (res != null) {
            try {
		while (res.next()) {
                    String name = res.getString("name");
                    String firstname = res.getString("firstname");
                    seller = new Seller(id,name,firstname);
		}
            } catch (SQLException e) {
            }
        }
        return seller;
    }
    
}
