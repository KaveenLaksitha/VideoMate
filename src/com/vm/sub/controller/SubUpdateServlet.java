package com.vm.sub.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vm.sub.dao.SubDao;
import com.vm.sub.model.Details;

/**
 * Servlet implementation class subAddServ
 */
@WebServlet("/update")
public class SubUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private SubDao subUp = new SubDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/updateSub.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String plan = request.getParameter("plan");
		String card = request.getParameter("card");
		String name = request.getParameter("name");
		String ex_date = request.getParameter("ex_date");
		String cvv = request.getParameter("cvv");
		
		Details details = new Details();
		
		details.setUname(uname);
		details.setEmail(email);
		details.setPlan(plan);
		details.setCard(card);
		details.setName(name);
		details.setEx_date(ex_date);
		details.setCvv(cvv);
		
		try {
			subUp.updateDetails(details);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
		
	}

}
