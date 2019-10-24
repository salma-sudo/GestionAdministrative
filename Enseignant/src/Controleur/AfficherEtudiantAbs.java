package Controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Etudiant;
import Bean.EtudiantAbs;
import DAO.CongeBD;
import DAO.EtudiantBD;
import Model.EtudiantModel;
import Model.Imétier;

/**
 * Servlet implementation class AfficherEtudiantAbs
 */
@WebServlet("/profile/view/AfficherEtudiantAbs")
public class AfficherEtudiantAbs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Imétier etudiantBD;
	public void init() throws ServletException {
		 etudiantBD=new EtudiantBD();
	   }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()){
			String filiere =request.getParameter("fil");
			String groupe=request.getParameter("group");
			String asc=request.getParameter("asc");
			
			EtudiantModel mod =new EtudiantModel();
			mod.setFilière(filiere);
			mod.setAsc(asc);
			mod.setGrp(groupe);
			int a=Integer.parseInt(asc);
			int g=Integer.parseInt(groupe);
			List<EtudiantAbs> etu = etudiantBD.getEtudiantABS(filiere, a, g);
			mod.setEtudiantAbs(etu);		
			request.setAttribute("modele",mod);
	        request.getRequestDispatcher("/profile/view/GestionAbsence.jsp").forward(request, response);
		}
	}

}
