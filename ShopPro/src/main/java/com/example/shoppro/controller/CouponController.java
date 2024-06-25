package com.example.shoppro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.shoppro.entity.Coupon;
import com.example.shoppro.repository.CouponRepository;

@Controller
@RequestMapping("/coupon")
public class CouponController {
	
	
	@Autowired
	private CouponRepository couponRepository;
	
	@GetMapping("/getallcoupons")
	public ModelAndView getAll() {
		
		ModelAndView mav = new ModelAndView("Coupon/coupon-list");
		mav.addObject("coupons", couponRepository.findAll());
		return mav;
	}
	
	@GetMapping("/addeventpage")
	public ModelAndView addPage() {
		ModelAndView mav = new ModelAndView("Coupon/coupon-add");
		mav.addObject("coupon", new Coupon());
		return mav;
	}
	
	@PostMapping("/addevent")
	public String addCoupon(@ModelAttribute Coupon coupon) {
		couponRepository.save(coupon);
		return "redirect:getallcoupons";
	}
	

}
