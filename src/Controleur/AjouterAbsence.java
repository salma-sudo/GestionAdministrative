package Controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Absence;
import DAO.AbsenceBD;

/**
 * Servlet implementation class AjouterAbsence
 */
@WebServlet("/AjouterAbsence")
public class AjouterAbsence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
		String statut[]=request.getParameterValues("Check");
		
		for(int i=0;i<statut.length;i++) {
			if(statut[i]!=null) {
				String id=statut[i];
				Absence absence=new Absence();
				String matiere=request.getParameter("matiere");
				absence.setId_et_fk(Integer.parseInt(id));
				absence.setMatiere(matiere);
				AbsenceBD.save(absence);
				out.println(id);
				out.println(statut[i]);
			
		}
		
		request.getRequestDispatcher("ListeAbsences.jsp").forward(request, response);
		}	
	}
	}
}
