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
 * Servlet implementation class SavePlayer
 */
@WebServlet("/SavePlayer")
public class SavePlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SavePlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private Team getTeamById(List<Team> equipos, Integer id) {
		for (Team team : equipos) {
			if (team.getId() == id) {
				return team;
			}

		}
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer teamId = Integer.parseInt(request.getParameter("teamId"));
		String name = request.getParameter("playerName");
		String lastname = request.getParameter("playerLastName");
		Integer playerAge = Integer.parseInt(request.getParameter("teamId"));

		HttpSession session = request.getSession();
		List<Team> equipos = (List<Team>) session.getAttribute("equipos");
		Integer numberPlayer = (Integer) session.getAttribute("numberTeam");
		numberPlayer = numberPlayer != null ? numberPlayer + 1 : 1;
		session.setAttribute("numberPlayer", numberPlayer);

		Player player = new Player();
		player.setId(numberPlayer);
		player.setFirstName(name);
		player.setLastName(lastname);
		player.setAge(playerAge);

		Team team = getTeamById(equipos, teamId);
		team.getPlayers().add(player);
		response.sendRedirect("team?id=" + teamId);
	}

}
