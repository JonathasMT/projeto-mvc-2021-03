package com.jonathasmt.atividademvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jonathasmt.atividademvc.model.Fornecedor;


@Controller
public class FornecedorController {
	
	@RequestMapping("cadastrarFornecedor")
	public String form() {
		return "formFornecedor";		
	}
	@RequestMapping(value="cadastrarFornecedor", method = RequestMethod.POST)
	public String form(Fornecedor fornecedor) {
		return "formFornecedor";		
	}

}

