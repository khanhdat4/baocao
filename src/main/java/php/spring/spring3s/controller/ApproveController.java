
package php.spring.spring3s.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import php.spring.spring3s.services.ApproveService;

@Controller
public class ApproveController {

	@Autowired
	ApproveService approveService;

	@GetMapping("listApp")
	public String listdepart(Model model) {
		Date d = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String datef = df.format(d);
		model.addAttribute("DATEF", datef);
		model.addAttribute("APPROVES", approveService.findAll());
		return "listDepartment";
	}

	@RequestMapping("/delete/{approvedbeforeid}")
	public String del(Model model, @PathVariable(name = "approvedbeforeid") String approvedbeforeid) {
		approveService.deleteById(approvedbeforeid);
		model.addAttribute("APPROVES", approveService.findAll());
		return "listDepartment";
	}
	
	@GetMapping("DRC002")
	public String listdepart123(Model model) {
		Date d = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String datef = df.format(d);
		model.addAttribute("DATEF", datef);
		model.addAttribute("APPROVES123", approveService.findAll());
		return "DRC002";
	}
}
