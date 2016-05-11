package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ServiceCharge {
    
    public ResultSet getServiceCharges(){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT service,cost FROM chargers");
            result = state.executeQuery();
            
        } catch (SQLException ex) {
        }
        return result;
    }
    
    
}
