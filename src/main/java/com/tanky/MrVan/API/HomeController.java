package com.tanky.MrVan.API;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
//		lists.add(new MonEntity("1l", "Mon 1", "Des mno 1", 45, 5));
//		lists.add(new MonEntity("2l", "Mon 2", "Des of mon 2", 123, 10));
//		lists.add(new MonEntity("3l", "Heroku", "Des of mon Heroku", 25, 2));
		
		ModelAndView mv = new ModelAndView("index.html");
		
		lists = monService.getAll();
		mv.addObject("mons", lists);
		mv.addObject("msg", "Mongo Atlat");
//		mv.addObject("header", "Hãy để chúng tôi chăm sóc cái bụng của bạn");
//		mv.addObject("subHeader", "Thực đơn ngon, gíá hạt dẻ cho một chiếc bụng đói mềm");
//		mv.addObject("footer", "Ngó sang menu chúng mình nhé...");
		
		return mv;
	}
		
	
	
}
