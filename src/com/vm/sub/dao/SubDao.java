package com.vm.sub.dao;
import java.sql.*;

import com.vm.sub.model.Details;
import com.vm.util.DBC2;


public class SubDao {
	
	//method for apply subscription
	
	public int addDetails(Details details) throws ClassNotFoundException{
		
		String INSERT_DATA="insert into sub_details(username,email,plan,card,name,ex_date,cvv)values(?,?,?,?,?,?,?)";//sql query
		
		int result=0;
		
		Connection con = DBC2.getConnection();//database connection establishing
		
		try {
			PreparedStatement ps = con.prepareStatement(INSERT_DATA);
			
			ps.setString(1, details.getUname());
			ps.setString(2, details.getEmail());
			ps.setString(3, details.getPlan());
			ps.setString(4, details.getCard());
			ps.setString(5, details.getName());
			ps.setString(6, details.getEx_date());
			ps.setString(7, details.getCvv());
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	//method for delete subscription

	
	public int delDetails(Details details) throws ClassNotFoundException{
		
		String INSERT_DATA="delete from sub_details where(username=? and email=?)";//sql query
		
		int result=0;
		
		Connection con = DBC2.getConnection();//database connection establishing
		
		try {
			PreparedStatement ps = con.prepareStatement(INSERT_DATA);
			
			ps.setString(1, details.getUname());
			ps.setString(2, details.getEmail());
			
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

	//method for update subscription

	public int updateDetails(Details details) throws ClassNotFoundException{
	
		String INSERT_DATA="update sub_details set plan=?,card=?,name=?,ex_date=?,cvv=? where username=? and email=?";//sql query
	
		int result=0;
	
		Connection con = DBC2.getConnection();//database connection establishing
	
		try {
			PreparedStatement ps = con.prepareStatement(INSERT_DATA);
		
		
			ps.setString(1, details.getPlan());
			ps.setString(2, details.getCard());
			ps.setString(3, details.getName());
			ps.setString(4, details.getEx_date());
			ps.setString(5, details.getCvv());
			ps.setString(6, details.getUname());
			ps.setString(7, details.getEmail());
		
			result = ps.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	
	}

}
