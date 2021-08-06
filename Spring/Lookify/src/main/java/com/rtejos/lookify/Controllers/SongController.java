package com.rtejos.lookify.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rtejos.lookify.Models.Song;
import com.rtejos.lookify.Service.SongService;

@Controller
public class SongController {
	
	private final SongService songService;

	public SongController(SongService songService) {
		this.songService = songService;
	}
	
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> canciones = songService.listSongs();
		model.addAttribute("songs", canciones);
		return "dashboard.jsp";
	}

}
