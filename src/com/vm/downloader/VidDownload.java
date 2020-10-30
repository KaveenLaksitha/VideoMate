package com.vm.downloader;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vm.dao.VidDao;

/**
 * Servlet implementation class VidDownload
 */
@WebServlet("/VidDownload")
public class VidDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest rqst, HttpServletResponse rspns) throws ServletException, IOException {
		
		VidDao dao= null;
		ServletOutputStream sos = null;
		String id = rqst.getParameter("id");
 		dao = new VidDao();
 		byte[] video = dao.getVideo(id);
		sos = rspns.getOutputStream();
		sos.write(video);
		sos.close();
	}

}
