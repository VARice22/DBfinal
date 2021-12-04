package javaapplication1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaApplication1 {
    public static void main(String[] args) {
        JavaApplication1 pro=new JavaApplication1();
        pro.connect();
    }
    void connect() 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javamdb","root","baccano1");
            System.out.println("Connection Established");
            System.out.println();
            
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM javamdb.song");
            while(rs.next()){
                String name= rs.getString("file_name");
                System.out.println(name);
            }
            
            
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
}
