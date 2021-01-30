package com.cybertek.eclipe.review_weeks.week_15;

public class Samsung extends Phone implements AndroidApp {


    public Samsung(String model, double size, double price){
        super("Samsung", model, size,price);
        if(price>1500){
            System.out.println("Samsung price cannot be more than 1500" );
            this.price=0;
        }
    }

    public void samsungPay(){
        System.out.println("useing Samsung pay");
    }

    @Override
    public void download() {
        System.out.println("Downloading from "+AppName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("calling to "+phoneNumber);
    }
}
