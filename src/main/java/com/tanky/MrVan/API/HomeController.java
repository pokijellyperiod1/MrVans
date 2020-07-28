package com.tanky.MrVan.API;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
		
	
	
}
