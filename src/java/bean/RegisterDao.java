package bean;

import java.sql.*;

public class RegisterDao {

	public static int register(user432 u){
		int status=0;
		try{
			Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into Login.user432 (`Email`,`Pass`)  values(?,?)");
			ps.setString(1,u.getEmail());
			ps.setString(2,u.getPass());
			
			status=ps.executeUpdate();
		}catch(Exception e){}
		
		return status;
	}
}
