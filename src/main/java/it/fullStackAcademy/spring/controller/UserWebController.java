package it.fullStackAcademy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/web/")
public class UserWebController {
	
	@GetMapping("/inserisciUtente")
	public ModelAndView inserisciUtente() {
		ModelAndView modelAndViewUser = new ModelAndView();
		modelAndViewUser.setViewName("index");
		return modelAndViewUser;

	}
	
	@GetMapping("/salvaUtente")
	public ModelAndView salvaUtente(@RequestParam String nomeUtente,@RequestParam String cognomeUtente,@RequestParam(required=false) String emailUtente) {
		ModelAndView modelAndViewUser = new ModelAndView();
		modelAndViewUser.setViewName("index");
	System.out.println(nomeUtente);
	System.out.println(cognomeUtente);
	System.out.println(emailUtente);
		return modelAndViewUser;

	}
}
