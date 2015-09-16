package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Product;
import com.springapp.mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by user on 9/16/2015.
 */
@Controller
@RequestMapping("/rest")
public class RestController
{
    @Autowired
    ProductService productService;


    @RequestMapping(value="/products", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts()
    {
        return productService.findAll();
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product getProductById(@PathVariable Integer id)
    {
        return productService.findById(id);
    }
}
