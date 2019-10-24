package Controleur;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Conge;
import DAO.CongeBD;

/**
 * Servlet implementation class DatePicker
 */
@WebServlet("/DatePicker")
public class DatePicker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String date_d = request.getParameter("date_d");
            String date_f =request.getParameter("date_f");
            String etat=request.getParameter("etat");
            String raison=request.getParameter("raison");
            Conge conge=new Conge();
            conge.setDate_d(date_d);
            conge.setDate_f(date_f);
            conge.setEtat(etat);
            conge.setRaison(raison);
            CongeBD.save(conge);
           
           out.println("Donnée sauvgardée");
           request.getRequestDispatcher("Index.html").include(request, response);
		}
        
	}

}
