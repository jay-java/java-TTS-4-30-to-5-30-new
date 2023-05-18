package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.UserDao;
import com.model.User;

@Controller
public class UserController {
	@Autowired
	private UserDao dao;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<User> list = dao.getAllUser();
		m.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/register")
	public String Login() {
		return "register";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping(value = "/insertUser", method = RequestMethod.POST)
	public RedirectView insertUser(@ModelAttribute User u,HttpServletRequest request) {
		dao.insertUser(u);
		RedirectView re = new RedirectView();
		re.setUrl(request.getContextPath()+"/");
		return re;
	}
	
	@RequestMapping(value = "/update/{id}")
	public ModelAndView updateUser(@PathVariable("id") int id) {
		User u = dao.getUserById(id);
		System.out.println(u);
		ModelAndView m = new ModelAndView();
		m.addObject("u", u);
		m.setViewName("update");
		return m;
	}
	@RequestMapping(value="/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id,HttpServletRequest request) {
		User u = dao.getUserById(id);
		dao.deleteUser(u);
		RedirectView re = new RedirectView();
		re.setUrl(request.getContextPath()+"/");
		return re;
	}
	
	
	

//	@RequestMapping(value = "/insertUser", method = RequestMethod.POST)
//	public void insertUser(@RequestParam("name") String name, 
//	@RequestParam("contact") long con,
//			@RequestParam("address") String add, 
//	@RequestParam("email") String em,
//			@RequestParam("password") String pass, User u) {
//		System.out.println(u);
//
////	 	String name = request.getParameter("name");
////		String con = request.getParameter("contact");
////		String add= request.getParameter("address");
////		String em = request.getParameter("email");
////		String pass = request.getParameter("password");
////		System.out.println(name+con+add+em+pass);
//	}

}
