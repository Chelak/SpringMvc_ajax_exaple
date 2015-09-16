package com.springapp.mvc.service;

import com.springapp.mvc.dao.ProductDAO;
import com.springapp.mvc.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 9/16/2015.
 */
@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductDAO productDAO;



    @Override
    public List<Product> findAll()
    {
        return productDAO.findAll();
    }

    @Override
    public Product findById(Integer productId)
    {
        return productDAO.findById(productId);
    }

    @Override
    public void addProduct(Product product)
    {
        productDAO.addProduct(product);
    }

    @Override
    public void editProduct(Product product, Integer productId)
    {
        productDAO.editProduct(product,productId);
    }

    @Override
    public void removeProduct(Integer productId)
    {
        productDAO.removeProduct(productId);
    }
}
