package com.rtejos.lookify.Controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	@GetMapping("/songs/{id}")
	public String ListSongs(@PathVariable("id") Long id, Model model) {
		Song searchSong = songService.buscaPorId(id);
		model.addAttribute("songs", searchSong);
		return "show.jsp";
	}
	
	
	@RequestMapping(value="/delete/{id}", method =RequestMethod.DELETE)
	public String deleteSong(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song, Model model) {
			return "new.jsp";			
	}
	
	@PostMapping("/songs/new")
	public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		} else {
			songService.creaCancion(song);
			return "redirect:/dashboard";
		}
	}
	
	
	@GetMapping("/search/topTen")
	public String topTen(Model model) {	
		List<Song> topTen = songService.listTopTen();
		model.addAttribute("songs", topTen);		
		return "topTen.jsp";
	}
	
	@GetMapping("/search/sheeron")
	public String sheeron(Model model) {	
		List<Song> searchSheeron = songService.listSongs();
		model.addAttribute("songs", searchSheeron);		
		return "sheeron.jsp";
	}
	
	
	@GetMapping("/search/like")
	public String sheeron2(@RequestParam("busqueda") String buscando, Model model) {	
		List<Song> searchSheeron = songService.searchArtist(buscando);
		String artista="";
		if(searchSheeron != null) {
			artista = searchSheeron.get(0).getArtist();
		} else {
			artista = "No encontrado";
		}
		model.addAttribute("songs", searchSheeron);	
		model.addAttribute("buscando", artista);
		return "sheeron.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	

}
