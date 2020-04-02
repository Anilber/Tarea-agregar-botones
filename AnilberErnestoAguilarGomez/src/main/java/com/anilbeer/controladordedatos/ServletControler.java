package com.anilbeer.controladordedatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Anilber.model.Cliente;


/**
 * Servlet implementation class ServletControler
 */
public class ServletControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String action = request.getParameter("btn");
		EntityManager em;
		
		EntityManagerFactory emf;
		
		emf= Persistence.createEntityManagerFactory("AnilberErnestoAguilarGomez");
		em= emf.createEntityManager();
		Cliente us = new Cliente();
		
		try {
		
			
			String id= request.getParameter("Id");
			String nombreu= request.getParameter("Nusuario");
			String apellidou= request.getParameter("Ausuario");
			String edadu= request.getParameter("Eusuario");
			String direccionu= request.getParameter("Dusuario");
			String duiu= request.getParameter("Duiusuario");
			String nitu= request.getParameter("Nitusuario");
			String grupoc= request.getParameter("Gclase");
			String ultiman= request.getParameter("Unota");
			
			
			
			us.setId(Integer.parseInt(id));
			us.setNombre(nombreu);
			us.setApellido(apellidou);
			us.setEdad(Integer.parseInt(edadu));
			us.setDireccion(direccionu);
			us.setDui(duiu);
			us.setNit(nitu);
			us.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoc));
			us.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(ultiman));
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		if (action.equals("Envio de datos")) {
			
			em.getTransaction().begin();
			em.persist(us);
			em.flush();
			em.getTransaction().commit();
			
			
		}else if (action.equals("Eliminar datos")) {
			
		
			us=em.getReference(Cliente.class, us.getId());
			em.getTransaction().begin();
			em.remove(us);
			em.flush();
			em.getTransaction().commit();
			
			
		}else if (action.equals("Actualizar datos")) {
			
			em.getTransaction().begin();
			em.merge(us);
			em.flush();
			em.getTransaction().commit();
			
		}
		
		
		response.sendRedirect("index.jsp");
		
		
		
		
		
			}

}
