package com.rtejos.overflow.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.overflow.models.Answers;
import com.rtejos.overflow.models.Questions;
import com.rtejos.overflow.models.Tags;
import com.rtejos.overflow.service.AnswersService;
import com.rtejos.overflow.service.QuestionsService;
import com.rtejos.overflow.service.TagsService;

@Controller
@RequestMapping("/questions")
public class QuestionsController {
	
	@Autowired
	QuestionsService questionsService;
	
	@Autowired
	TagsService tagsService;
	
	@Autowired
	AnswersService answersService;
	
	private Tags getTagByString(String string) {
		Tags tags = tagsService.findBySubject(string);
		if(tags == null) {
			tags = new Tags();
			tags.setSubject(string);
			tags = tagsService.save(tags);
		}
		return tags;
	}
	
	

	
	@GetMapping("/")
	public String index(Model model) {
		List<Questions> listQuestions = questionsService.buscatodos();
		model.addAttribute("questions", listQuestions);		
		return "index.jsp";
	}
	
	@GetMapping("/new")
	public String newQuestions(Model model) {
		return "newQuestions.jsp";
	}
	
	@PostMapping("/new")
	public String createNewQuestions(@RequestParam(value = "question") String question,@RequestParam(value = "tags") String tags,Model model) {
		String[] tagsName = tags.split(",");
		List<Tags> tagsObject = new ArrayList<Tags>();
		for (int i = 0; i < tagsName.length; i++) {
			String string = tagsName[i].toLowerCase();
			tagsObject.add(getTagByString(string));
		}
		Questions questions = new Questions();
		questions.setQuestion(question);
		questions.setTags(tagsObject);
		questionsService.save(questions);
		return index(model);
	}
	
	
	@GetMapping("/{idQuestion}")
	public String viewQuestions(@PathVariable(value = "idQuestion") Long idQuestion, Model model) {
		Questions question = questionsService.findById(idQuestion);
		List<Answers> answers = answersService.findAllByQuestions(question);
		model.addAttribute("answers", answers);
		model.addAttribute("question", question);
		return "questionDetail.jsp";
	}
	
	
	@PostMapping("/{idQuestion}/addAnswer")
	public String addAnswer(@PathVariable(value = "idQuestion") Long idQuestion,@RequestParam(value = "answer") String answer, Model model) {
		Questions question = questionsService.findById(idQuestion);
		Answers answersObj = new Answers();
		answersObj.setAnswers(answer);
		answersObj.setQuestions(question);
		answersService.save(answersObj);
		
		List<Answers> answers = answersService.findAllByQuestions(question);
		model.addAttribute("answers", answers);
		model.addAttribute("question", question);
		return "questionDetail.jsp";
	}
	
	
	
	
	
	
}
