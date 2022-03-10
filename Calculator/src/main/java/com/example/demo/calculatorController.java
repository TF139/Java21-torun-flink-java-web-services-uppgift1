package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class calculatorController {

	@RequestMapping("/minus")
	public double minus (double Tal, double Tal2){
		return Tal - Tal2;
	}
	@RequestMapping("/multi")
	public double multi (double Tal, double Tal2){
		return Tal * Tal2;
	}
	@RequestMapping("/div")
	public double div (double Tal, double Tal2){
		return Tal / Tal2;
	}
	@RequestMapping("/plus")
	public double plus (double Tal, double Tal2){
		return Tal + Tal2;
	}
}
