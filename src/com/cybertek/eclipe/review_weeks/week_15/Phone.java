package com.cybertek.eclipe.review_weeks.week_15;

public abstract class Phone {

    String brand;
    String model;
    double price;
    double size;

    public Phone(String brand, String model, double price, double size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        if(price>0){
            this.price = price;
        }else{
            System.out.println("Price cannot be 0 or less");
        }
    }

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);
}
