package com.rtejos.equipos.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comrtejos.equipos.modelo.Player;
import comrtejos.equipos.modelo.Team;

/**
 * Servlet implementation class SaveTeam
 */
@WebServlet("/SaveTeam")
public class SaveTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveTeam() {
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
		String teamName = request.getParameter("teamName");
		HttpSession session = request.getSession();
		List<Team> equipos = (List<Team>) session.getAttribute("equipos");
		Integer numberTeam = (Integer) session.getAttribute("numberTeam");
		numberTeam = numberTeam != null ? numberTeam +1 : 1;
		session.setAttribute("numberTeam", numberTeam);
		if(equipos == null) {
			equipos = new ArrayList<Team>();
		}
		Team team = new Team();
		team.setName(teamName);
		team.setPlayers(new ArrayList<Player>());
		team.setId(numberTeam);
		equipos.add(team);
		session.setAttribute("equipos", equipos);
		response.sendRedirect("Home");
	}

}
