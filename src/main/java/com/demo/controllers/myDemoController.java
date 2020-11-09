package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class myDemoController 
{
	private String[] quotes= {"To be or not to be - shakespeare","Spring in natures way of saying Let's Party",
			"The time is alwyas right to do what is right"};
	@RequestMapping(value="/getQuote")
	public String  getRandomQuote(Model model)
	{
		int rand=new Random().nextInt(quotes.length);
		String randomQuote=quotes[rand];
		model.addAttribute("randomQuote",randomQuote);
		return "quote";
	}
	@ModelAttribute
	public void setUserDetails(@RequestParam("userName") String userName, Model model)
	{
		model.addAttribute("userName",userName);
		String userRole="undefined";
		if(userName.equals("Andy"))
		{
			userRole = "Student";
		}
		else if(userName.equals("Allana"))
		{
			userRole = "Dean";
		}
		model.addAttribute("userRole",userRole);
		
		System.out.println("Model updated with user information.");
	}
	
	
}