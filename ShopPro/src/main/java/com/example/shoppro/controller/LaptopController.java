package com.example.shoppro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.shoppro.entity.Laptop;
import com.example.shoppro.repository.LaptopRepository;

@Controller
@RequestMapping("/laptop")
public class LaptopController {
	
	
	@Autowired
	private LaptopRepository lapRepository;
	
	
	@GetMapping("/")
	public ModelAndView getAll() {
		ModelAndView mav = new ModelAndView("Address/address-list");
		List<Laptop> laptops = lapRepository.findAll();
		mav.addObject("laptops", laptops);
		return mav;
	}
	
	@GetMapping("/addproductpage")
	public ModelAndView addLaptopPage() {
		ModelAndView mav = new ModelAndView("/Address/address-add");
		Laptop newLaptop = new Laptop();
		mav.addObject("laptop", newLaptop);
		return mav;
	}
	
	@PostMapping("/addlaptop")
	public String addLaptop(@ModelAttribute Laptop laptop) {
		lapRepository.save(laptop);
		return "redirect:laptop";
	}
	
	@DeleteMapping("/delete")
	public String deleteLaptops(@RequestParam int id) {
		lapRepository.deleteById(id);
		return "redirect:laptop";
	}
	

}
