/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class Koneksi {
    public Statement state;
    public Connection connect;
    String url = "jdbc:mysql://localhost/db_pegawai";
    
     public void KoneksiDatabase(){
        try {
            connect = DriverManager.getConnection(url,"root","");
            state = connect.createStatement();
        } catch (Exception e) {
            System.err.println("SQL erorr : "+e);
        }
    }
    
}
