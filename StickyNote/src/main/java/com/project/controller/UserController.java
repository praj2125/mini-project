 package com.project.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.entity.StickyEntity;
import com.project.entity.UserEntity;
import com.project.exception.UserServiceException;
import com.project.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	  /*----------------------------------------User Registration--------------------------------------------*/
	@RequestMapping("/register.project")
	public String register(HttpServletRequest request, Map model) {
		UserEntity user = new UserEntity();
		user.setFirst_name(request.getParameter("fname"));
		user.setLast_name(request.getParameter("lname"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		try {
			userService.register(user);
			return "index.jsp";
		} catch (UserServiceException e) {
			model.put("message", e.getMessage());
			return "register.jsp";
		}
	}

	/*----------------------------------------User Login--------------------------------------------*/
	@RequestMapping("/Login.project")
	public String login(HttpServletRequest request, Map model, HttpSession session) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		session = request.getSession();
		try {
			UserEntity user = userService.login(email, password);
			session.setAttribute("user", user.getUserId());

			System.out.println(user.getUserId());
			model.put("usersData", user);
			return "loginHome.jsp";
		} catch (UserServiceException e) {
			model.put("message", e.getMessage());
			return "Login.jsp";
		}
	}

	/*----------------------------------------Logout Session--------------------------------------------*/
	@RequestMapping("/logout.project")
	public String logout(HttpServletRequest request, Map<String, Object> model, HttpSession session) {
		session = request.getSession();
		session.setAttribute("user", null);
		return "index.jsp";
	}
}










/*@RequestMapping("/Login.project")
public String login(HttpServletRequest request, Map model, HttpSession session) {
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	session = request.getSession();
	System.out.println(session.getAttribute("user") + " " + "==");
	int uid=(Integer)session.getAttribute("user");
	try {
		UserEntity user= userService.login(email, password);
		model.put("usersData", user);
		session.setAttribute("user", user.getUserId());
		try {
				List<StickyEntity> list=userService.checkStickey();
				model.put("list", list);
				return "StickyList.jsp";
		}catch(UserServiceException e) {
			model.put("message", e.getMessage());
			return "loginHome.jsp";
		}
	}
	catch(UserServiceException e) {
		model.put("message", e.getMessage());
		return "Login.jsp";
	}
}*/