
package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LabTechnician {
    
   
    
    public void setCharges(){
        
    }
    
    public ResultSet viewPatientList(int cate){      // have the option to give the relevant date too.
    ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT name FROM labslots WHERE category = ?");
            state.setInt(1, cate);
            result = state.executeQuery();
        } catch (SQLException | NullPointerException ex) {
        }
        return result;
    }
    
}
