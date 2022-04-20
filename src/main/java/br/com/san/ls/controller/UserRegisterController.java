package br.com.san.ls.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.san.ls.dto.UserDTO;
import br.com.san.ls.service.UserService;

@Controller
@RequestMapping("/user")
public class UserRegisterController {

	@Autowired
	private UserService service;

	@GetMapping("/register")
	public ModelAndView showFormRegister() {
		ModelAndView mv = new ModelAndView("/register_templates/register.html");
		mv.addObject("userDTO", new UserDTO());
		return mv;
	}

	@PostMapping("/new")
	public ModelAndView processRegister(@Valid UserDTO userDTO, BindingResult bdResult) {
		ModelAndView mv = new ModelAndView("/register_templates/register.html");

		if (bdResult.hasErrors()) {
			mv.addObject("userDTO", userDTO);
		} else {
			service.save(userDTO.toUser());
			mv.setViewName("/register_templates/welcome_user.html");
		}

		return mv;
	}

}
