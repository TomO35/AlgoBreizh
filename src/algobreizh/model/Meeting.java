/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author user
 */
public class Meeting {
    
    private int id;
    private Date date;
    private Time hour;
    private Customer customer;
    private Seller seller;
    private String info;
    
    public Meeting(Date d, Time h, Customer c, Seller s, String i){
        date = d;
        hour = h;
        customer = c;
        seller = s;
        info = i;
    }
    
    public Meeting(int id, Date d, Time h, Customer c, Seller s, String i){
        this.id = id;
        date = d;
        hour = h;
        customer = c;
        seller = s;
        info = i;
    }
    
    public int getId(){
        return id;
    }
    
    public Date getDate(){
        return date;
    }
    
    public Time getHour(){
        return hour;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public Seller getSeller(){
        return seller;
    }
    
    public String getInfo(){
        return info;
    }
    
    public void setId(int i){
        id = i;
    }
    
    public void setDate(Date d){
        date = d;
    }
    
    public void setHour(Time h){
        hour = h;
    }
    
    public void setCustomer(Customer c){
        customer = c;
    }
    
    public void setSeller(Seller s){
        seller = s;
    }
    
    public void setInfo(String i){
        info = i;
    }
}
