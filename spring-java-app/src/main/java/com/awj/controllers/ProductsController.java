package com.awj.controllers;

import com.awj.dal.Repository;
import com.awj.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Radu on 14/01/16.
 */
@RestController
public class ProductsController {

    private Repository<Product> productsRepository = new Repository<>();


    public ProductsController(){

        productsRepository.add(new Product(1, "Onion", "Food", 500, 12));
        productsRepository.add(new Product(2, "Keyboard", "Electronics", 40, 530));
        productsRepository.add(new Product(3, "Mouse", "Electronics", 55, 450));
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProducts(){
        return productsRepository.getAll();
    }

    @RequestMapping(value = "products/create", method = RequestMethod.POST)
    public void createProduct(@RequestBody Product product){
        productsRepository.add(product);
    }

    @RequestMapping(value = "products/delete", method = RequestMethod.DELETE)
    public void deleteProduct(@RequestBody Integer id){
        productsRepository.delete(id);
    }

    @RequestMapping(value = "products/update", method = RequestMethod.PUT)
    public void updateProduct(@RequestBody Product product){
        productsRepository.update(product);
    }
}