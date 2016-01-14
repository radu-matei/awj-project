package com.awj.models;

/**
 * Created by Radu on 14/01/16.
 */
public class Product extends Model<Product>{

    private String name;
    private String category;
    private Integer stock;
    private double price;

    public Product(){

    }

    public Product(Integer id, String name, String category, Integer stock, double price){
        this.id = id;
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.price = price;
    }

    public Integer getId(){
        return id;
    }

    @Override
    public void update(Product product) {
        name = product.name;
        category = product.category;
        stock = product.stock;
        price = product.price;
    }


    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public Integer getStock(){
        return stock;
    }

    public double getPrice(){
        return price;
    }


}