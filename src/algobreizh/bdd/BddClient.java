/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.bdd;

import algobreizh.model.Customer;
import algobreizh.model.Meeting;
import algobreizh.model.Seller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BddClient {
    
    BddAccess bdda = new BddAccess();
    
    public void createCustomer(Customer c){
        bdda.connectBdd();
        String querry = "INSERT INTO client VALUES (\'" + c.getName() 
                + "\',\'" + c.getFirstname() + "\',\'" + c.getCompany()
                + "\',\'" + c.getaddress() + "\',\'" + c.getCp()
                + "\',\'" + c.getVille() + "\')";
        Tools.execute(querry);
    }
    
    public void createMeeting(Meeting m){
        bdda.connectBdd();
        String querry = "INSERT INTO meeting VALUES (\'" + m.getDate()
                + "\',\'" + m.getCustomer().getId() + "\',\'"
                + m.getSeller().getId() + "\',\'" + m.getInfo() + "\')";
        Tools.execute(querry);
    }
    
    public ArrayList<Meeting> getMeetings(Seller s){
        bdda.connectBdd();
        ArrayList<Meeting> meetings = new ArrayList<>();
        String querry = "SELECT * FROM meeting WHERE id_seller = " + s.getId();
        ResultSet res = Tools.execute(querry);
        if (res != null) {
            try {
		while (res.next()) {
                    int id = res.getInt("id_meeting");
                    int date = res.getInt("date_meeting");
                    int id_customer = res.getInt("id_customer");
                    Customer customer = getCustomer(id_customer);
                    int id_seller = res.getInt("id_seller");
                    Seller seller = getSeller(id_seller);
                    String info = res.getString("info");
                    meetings.add(new Meeting(id,date,customer,seller,info));
		}
            } catch (SQLException e) {
            }
        }
        return meetings;
    }
    
    public ArrayList<Customer> getCustomers(){
        bdda.connectBdd();
        ArrayList<Customer> customers = new ArrayList<>();
        String querry = "SELECT * FROM Customer";
        ResultSet res = Tools.execute(querry);
        if (res != null) {
            try {
		while (res.next()) {
                    int id = res.getInt("id_customer");
                    String name = res.getString("name");
                    String firstname = res.getString("firstname");
                    String company = res.getString("company");
                    String address = res.getString("address");
                    String cp = res.getString("cp");
                    String ville = res.getString("ville");
                    customers.add(new Customer(id,name,firstname,company,address,cp,ville));
		}
            } catch (SQLException e) {
            }
        }
        
        return customers;
    }
    
    public Customer getCustomer(int id){
        bdda.connectBdd();
        String querry = "SELECT * FROM customer WHERE id_customer = " + id;
        Customer customer = new Customer();
        ResultSet res = Tools.execute(querry);
        if (res != null) {
            try {
		while (res.next()) {
                    String name = res.getString("name");
                    String firstname = res.getString("firstname");
                    String company = res.getString("company");
                    String address = res.getString("address");
                    String cp = res.getString("cp");
                    String ville = res.getString("ville");
                    customer = new Customer(id,name,firstname,company,address,cp,ville);
		}
            } catch (SQLException e) {
            }
        }
        return customer;
    }
    
    public Seller getSeller(int id){
        bdda.connectBdd();
        String querry = "SELECT * FROM seller WHERE id_seller = " + id;
        Seller seller = new Seller();
        ResultSet res = Tools.execute(querry);
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
