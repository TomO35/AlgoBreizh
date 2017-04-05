/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algobreizh.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class BddAccess {
    
    public static ResultSet execute(String requete) {
	Connection connexion;
	Statement stmt = null;
	ResultSet res = null;
	try {
            connexion = DriverManager.getConnection("jdbc:mysql://159.180.230.207/sio_groupe1?user=groupe1&password=password&autoReconnect=true&useSSL=false");
            stmt = connexion.createStatement();
            if(stmt.execute(requete)) {
		res = stmt.getResultSet();
            }
	} catch (Exception e) {
            System.out.println(e);
	}
	return res;
    }
    
}
