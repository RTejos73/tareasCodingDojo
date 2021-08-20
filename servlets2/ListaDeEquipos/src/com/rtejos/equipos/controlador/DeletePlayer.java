package com.rtejos.equipos.controlador;

import java.io.IOException;
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
 * Servlet implementation class DeletePlayer
 */
@WebServlet("/DeletePlayer")
public class DeletePlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer teamId = Integer.parseInt(request.getParameter("idTeam"));
		Integer playerId = Integer.parseInt(request.getParameter("idPlayer"));

		HttpSession session = request.getSession();
		List<Team> equipos = (List<Team>) session.getAttribute("equipos");
		Team team = getTeamById(equipos,teamId);
		
		for(Player player : team.getPlayers()) {
			if(player.getId() == playerId) {
				team.getPlayers().remove(player);
				break;
			}
		}
		response.sendRedirect("team?id="+teamId);
	}

	
	
	
	
	private Team getTeamById(List<Team>equipos, Integer id) {
		for(Team team : equipos) {
			if(team.getId()== id) {
				return team;
			}
		}
		return null;
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
