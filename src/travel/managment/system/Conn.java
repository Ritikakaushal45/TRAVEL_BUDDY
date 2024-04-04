package travel.managment.system;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///travelmanagmentsystem","root","ritika291202");

            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}


