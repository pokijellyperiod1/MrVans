package com.tanky.MrVan.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tanky.MrVan.Entity.MonEntity;
import com.tanky.MrVan.Service.MonService;

@Controller
public class HomeController {

	@Autowired
	private MonService monService;
	
	private List<MonEntity> lists = new ArrayList<>();
	
	@GetMapping("/")
	public ModelAndView lists() {
		ModelAndView mv = new ModelAndView("vueJS.html");
		
		lists = monService.getAll();
		mv.addObject("mons", lists);
		mv.addObject("msg", "Mongo Atlat");
		
		
		
		return mv;
	}
	
	@GetMapping("/admin")
	@ResponseBody
	public String test() {
		return "Admin Page";
	}
	
	@GetMapping("/admin/test")
	@ResponseBody
	public String test_test() {
		return "Admin Page Test";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
	        @RequestParam(value = "error", required = false) String error,
	        @RequestParam(value = "logout", required = false) String logout) {

	    ModelAndView model = new ModelAndView();
	    if (error != null) {
	        model.addObject("error", "Invalid username and password!");
	    }

	    if (logout != null) {
	        model.addObject("msg", "You've been logged out successfully.");
	    }
	    model.setViewName("login");

	    return model;

	}
		
	
	
}
