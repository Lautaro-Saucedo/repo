/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebadriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laucha
 */
public class Pruebadriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
                    
                    } catch (ClassNotFoundException ex) {
                        System.out.println("error");
            Logger.getLogger(Pruebadriver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
