package retriever;

import java.util.*;


import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletResponse;
import javax.servlet.*;

import videoRetrive.DBConnection;

/**
 * Servlet implementation class retriveVid
 */
@WebServlet("/retriveVid")
public class retriveVid extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		byte[] vid = null;
		ServletOutputStream sos = null;
        // queries the database
		String sqlQuery = "select file from content";
		try {
            // connects to the database
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ResultSet rs = ps.executeQuery();
		
			if(rs.next()) {
					vid = rs.getBytes(1);
			}
				sos = response.getOutputStream();
				sos.write(vid);
		
			}

		
				catch(Exception e){
					e.printStackTrace();
				}
		
			}

}
