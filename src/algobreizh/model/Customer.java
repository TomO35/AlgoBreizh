/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.model;

public class Customer {
    
    private int id;
    private String name;
    private String firstname;
    private int phone;
    private String email;
    private String company;
    private String address;
    private String cp;
    private String city;
    
    public Customer(String n, String f, int p, String e,
            String c, String a, String cp, String v){
        name = n;
        firstname = f;
        phone = p;
        email = e;
        company = c;
        address = a;
        this.cp = cp;
        city = v;
    }
    
    public Customer(int i, String n, String f, int p, String e,
            String c, String a, String cp, String v){
        id = i;
        name = n;
        firstname = f;
        phone = p;
        email = e;
        company = c;
        address = a;
        this.cp = cp;
        city = v;
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
    
    public int getPhone(){
        return phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getCompany(){
        return company;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getCp(){
        return cp;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setFirstname(String f){
        firstname = f;
    }
    
    public void setPhone(int p){
        phone = p;
    }
    
    public void setEmail(String e){
        email = e;
    }
    
    public void setCompany(String c){
        company = c;
    }
    
    public void setAddress(String a){
        address = a;
    }
    
    public void setCp(String cp){
        this.cp = cp;
    }
    
    public void setCity(String v){
        city = v;
    }
    
}
