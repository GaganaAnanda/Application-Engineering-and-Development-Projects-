/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author gagan
 */
public class Product {
    
    private String name;
    private String description;
    private String availNum;
    private String price;
    private Address manufactureAddress;
    private Address shippingAddress;
    
    public Product(){
        manufactureAddress = new Address();
        shippingAddress = new Address();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAvailNum() {
        return availNum;
    }

    public String getPrice() {
        return price;
    }

    public Address getManufactureAddress() {
        return manufactureAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setManufactureAddress(Address manufactureAddress) {
        this.manufactureAddress = manufactureAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}
