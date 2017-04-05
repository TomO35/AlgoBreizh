/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.model;

public class Seller {
    
    private int id;
    private String name;
    private String firstname;
    
    public Seller(String n, String f){
        name = n;
        firstname = f;
    }
    
    public Seller(int i, String n, String f){
        id = i;
        name = n;
        firstname = f;
    }
    
    public Seller(){
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
    
}
