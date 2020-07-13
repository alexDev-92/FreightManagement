package edu.depaul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.depaul.model.Load;
import edu.depaul.model.LoadRepository;
import edu.depaul.model.LoadService;

@Controller
@RequestMapping("/freightmanagement/loads")
public class loadController {
	
	@Autowired
	LoadService loadService;
	
	@Autowired
	LoadRepository loadRepo;
	
	
	@GetMapping
	public String showLoads(Model model) {
		model.addAttribute("loads",loadRepo.findAll());
		return "loads/allLoads";
	}
	
	@RequestMapping(params = "createLoad")
	public String createLoad(Model model) {
		model.addAttribute("newLoad", new Load());
		return "loads/createLoads";
	}
	
	@PostMapping
	public String addLoad(@ModelAttribute("loads") Load load, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			return "loads/createLoads"; 
		}
		
		loadRepo.save(load);
		
		return "redirect:/freightmanagement/loads";
		
	}

	
}
