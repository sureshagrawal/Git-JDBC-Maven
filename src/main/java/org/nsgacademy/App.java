package org.nsgacademy;

import java.sql.*;

import static java.lang.System.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/nsgacademy", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from celebrity");
            while(rs.next()){
                out.println(rs.getString(2));
                out.println(rs.getString(3));


            }

        }catch(SQLException sql){
            out.println(sql);
        } catch(Exception e){
            out.println(e);
        }
    }
}
