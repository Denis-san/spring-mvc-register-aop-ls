package br.com.san.ls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.san.ls.entity.User;

@Controller
@RequestMapping("/user")
public class UserRegisterController {

	@GetMapping("/register")
	public ModelAndView showFormRegister() {
		ModelAndView mv = new ModelAndView("/register_templates/register.html");
		mv.addObject("user", new User());
		return mv;
	}

}
