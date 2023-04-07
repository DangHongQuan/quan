package com.example.computer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.computer.model.Device;
import com.example.computer.model.Manufacture;
import com.example.computer.service.ComputerService;



@Controller
@RequestMapping("computer")
public class ConputerController {
    @Autowired
    private ComputerService service;

   
    @GetMapping("/home")
    public String getAllComputerManager(Model model) {
    	List<Manufacture> list = service.getAllComputerManager();
    	model.addAttribute("list",list);
    	return "computer/home";
	}

	@PostMapping("/home")
    public String findOptionsComputer( @RequestParam(name = "manid" , required = false) Integer manId , Model model  ) {
    	List<Manufacture> list = service.getAllComputerManager();
		List<Device> devices = service.getAllDeviceManager(manId);
		model.addAttribute("device", devices);
    	model.addAttribute("list",list);
    	return "redirect:/computer/home";
	}


}


  


