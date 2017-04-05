/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.model;

import algobreizh.bdd.BddAccess;
import algobreizh.bdd.BddClient;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class Algobreizh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BddAccess bdda = new BddAccess();
        ResultSet rs = bdda.execute("SELECT * FROM client");
        
    }
    
}
