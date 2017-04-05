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
public class Customer {
    
    private int id;
    private String name;
    private String firstname;
    private String company;
    private String address;
    private String cp;
    private String ville;
    
    public Customer(String n, String l, String c, String a, String cp, String v){
        name = n;
        firstname = l;
        company = c;
        address = a;
        this.cp = cp;
        ville = v;
    }
    
    public Customer(int i, String n, String l, String c, String a, String cp, String v){
        id = i;
        name = n;
        firstname = l;
        company = c;
        address = a;
        this.cp = cp;
        ville = v;
    }
    
    public Customer(){   
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getFirstname(){
        return firstname;
    }
    
    public String getCompany(){
        return company;
    }
    
    public String getaddress(){
        return address;
    }
    
    public String getCp(){
        return cp;
    }
    
    public String getVille(){
        return ville;
    }
    
}
