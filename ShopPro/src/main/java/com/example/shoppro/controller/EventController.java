package com.example.shoppro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.shoppro.entity.Event;
import com.example.shoppro.repository.EventRepository;

@Controller
@RequestMapping("/event")
public class EventController {
	
	
	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping("/getallevents")
	public ModelAndView getAll() {
		ModelAndView mav = new ModelAndView("Event/event-list");
		List<Event> events = eventRepository.findAll();
		mav.addObject("allevents", events);
		return mav;
	}
	
	
	@GetMapping("/eventaddpage")
	public ModelAndView addEventPage() {
		ModelAndView mav = new ModelAndView("Event/event-add");
		Event newEvent = new Event();
		mav.addObject("newevent", newEvent);
		return mav;
	}
	
	@PostMapping("/addevent")
	public String addEvent(@ModelAttribute Event event) {
		eventRepository.save(event);
		return "redirect:getallevents";
	}
	
//	@DeleteMapping("/delete")
//	public String deleteLaptops(@RequestParam int id) {
//		eventRepository.deleteById(id);
//		return "redirect:getallevents";
//	}
	
	

}
