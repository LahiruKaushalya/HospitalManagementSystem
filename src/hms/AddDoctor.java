package hms;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class AddDoctor {
    
    
    public void addDoctor(int cat,Date bDay,String name,String id,String mobile,String address,String doctorStr) throws SQLException{
        Statement stat = ConnectionHandler.conToDB().createStatement();

            stat.executeUpdate("INSERT INTO doctor(name,birthday,category,telephone,nic,schedule_code) "
                                +"VALUES ('"+name+"','"+convert(bDay)+"','"+cat+"','"
                                +Integer.parseInt(mobile)+"','"+id+"','"+doctorStr+"')");
        
    }
    
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
}
