package php.spring.spring3s.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import php.spring.spring3s.model.User;
import php.spring.spring3s.services.UserService;
import java.util.Calendar;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@Autowired

	@RequestMapping("COM001")
	public String showLogin() {
		return "COM001";
	}

	@PostMapping("checklogin")
	public String checkLogin(Model model, @RequestParam("username") String username,

			@RequestParam("password") String password, HttpSession session) {
		if (userService.isLogin(username, password)) {
			session.setAttribute("USERNAME", username);
			return "COM002";
		} else {
			model.addAttribute("ERROR", "Username or Password is Wrong!!");
		}
		return "COM001";
	}

	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("USERNAME");
		return "COM001";
	}

	@RequestMapping("COM002")
	public String backHome(Model model, HttpSession session) {
		if (session.getAttribute("USERNAME") != null) {
			model.addAttribute("USERS", userService.findAll());
			return "COM002";
		}

		return "COM001";
	}

	@GetMapping("CMM001")
	public String list(Model model, HttpSession session) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		model.addAttribute("YEAR", year);
		session.getAttribute("USERNAME");
		model.addAttribute("USERS", userService.findAll());
		return "CMM001";
	}

	@GetMapping("CMM002")
	public String cmm002(Model model) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		model.addAttribute("YEAR", year);
		return "CMM002";
	}

	@GetMapping("add")
	public String add(Model model) {
		User us = new User();
		model.addAttribute("USER", us);
		model.addAttribute("ADD", "Update");
		return "AddForm";
	}
	

	@PostMapping("Update")
	public String update(Model model, @ModelAttribute("USER") User user) {
		userService.save(user);
		model.addAttribute("SUCCESSFUL", "Add Success!");
		return "AddForm";
	}
	
	@GetMapping("register")
	public String register(Model model) {
		User us = new User();
		model.addAttribute("ACCOUNT", us);
		model.addAttribute("REGISTER", "RegisterAcc");
		return "RegisterForm";
	}

	@PostMapping("RegisterAcc")
	public String registeracc(Model model, @ModelAttribute("ACCOUNT") User user) {
		userService.save(user);
		model.addAttribute("REGISTERSUCCESSFUL", "Register Successful!");
		return "RegisterForm";
	}
	

	@GetMapping("listCMM002")
	public String listcmm002(Model model) {
		model.addAttribute("USERS", userService.findAll());
		return "ListCMM002";
	}

	@RequestMapping("/del/{id}")
	public String delete(Model model, @PathVariable(name = "id") String id) {
		userService.deleteById(id);
		model.addAttribute("USERS", userService.findAll());
		return "ListCMM002";
	}

	@GetMapping("DRE001")
	public String dre001(Model model) {
		model.addAttribute("USERS", userService.findAll());
		return "DRE001";
	}

	@GetMapping("DRE002")
	public String dre002() {
		return "DRE002";
	}

	@GetMapping("DRC001")
	public String drc001() {
		return "DRC001";
	}	
}
