package com.vm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vm.dao.VidDao;
import com.vm.dto.VidDto;

/**
 * Servlet implementation class VidViewController
 */
@WebServlet("/VidViewController")
public class VidViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest rqst, HttpServletResponse rspns) throws ServletException, IOException {
		VidDao vidDao = null;
		vidDao = new VidDao();
		List<VidDto> list =  vidDao.getData();
		
		rqst.setAttribute("list", list);
		RequestDispatcher dispatcher = rqst.getRequestDispatcher("video.jsp");
		dispatcher.forward(rqst, rspns);
	}

}
