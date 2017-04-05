/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.model;

/**
 *
 * @author user
 */
public class Meeting {
    
    private int id;
    private int date;
    private Customer customer;
    private Seller seller;
    private String info;
    
    public Meeting(int d, Customer c, Seller s, String i){
        date = d;
        customer = c;
        seller = s;
        info = i;
    }
    
    public Meeting(int id, int d, Customer c, Seller s, String i){
        this.id = id;
        date = d;
        customer = c;
        seller = s;
        info = i;
    }
    
    public int getId(){
        return id;
    }
    
    public int getDate(){
        return date;
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
    
    public void setDate(int d){
        date = d;
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
