package group3.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import group3.model.User;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest arg0, HttpServletResponse arg1){
		
		return new ModelAndView("login");
	}
	@RequestMapping(value = "/handlerLogin", method=RequestMethod.POST)
	public ModelAndView handlerLogin(@RequestParam("username") String username
			,@RequestParam("password") String password){
		
		return new ModelAndView("/login");
	}
}
