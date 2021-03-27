package com.jonathasmt.atividademvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SobreOSistemaController {

	@RequestMapping("/sobre")	
	public String sobre() {
		return "sobreOSistema";		
	}
}
