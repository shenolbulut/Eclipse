package com.cybertek.eclipe.review_weeks.week_15;

public class IPhone extends Phone implements Appleapp{


    public IPhone( String model, double size, double price) {
        super("IPhone", model, price, size);
        if(price>2000){
            System.out.println("Iphone's price cannot be more than 2000");
            price=0;
        }
    }

    public void faceTime(long phoneNumber){
        System.out.println("Facetiming"+phoneNumber );
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Calling "+phoneNumber);
    }


    @Override
    public void download() {
        System.out.println("Downloading from "+AppName);
    }
}
