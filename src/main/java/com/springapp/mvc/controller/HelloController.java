package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/")
public class HelloController
{


	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value="/ajax", method= RequestMethod.GET)
	@ResponseBody
	public Set<String> testAjax()
	{
		Set<String> records = new HashSet<String>();
		records.add("Record #1");
		records.add("Record #2");
		records.add("Record #3");
		records.add("Record #4");
		records.add("Record #5");


		return records;
	}

	@RequestMapping(value="/products", method = RequestMethod.GET)
	@ResponseBody
	public Product getProduct()
	{
		Product product = new Product();
		product.setProductName("product1");
		product.setProductDescription("product description");
		product.setProductStock(20);
		product.setProductPrice(35.00);

		return product;
	}
}