package br.com.san.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.san.ls.entity.User;
import br.com.san.ls.service.UserService;

@Controller
@RequestMapping("/user")
public class UserRegisterController {

	@Autowired
	private UserService service;

	@GetMapping("/register")
	public ModelAndView showFormRegister() {
		ModelAndView mv = new ModelAndView("/register_templates/register.html");
		mv.addObject("user", new User());
		return mv;
	}

	@PostMapping("/new")
	public String processRegister(User user) {

		service.save(user);

		return "/register_templates/welcome_user.html";
	}

}
