package com.cybertek.eclipe.review_weeks.week_15;

public class CyberPhone extends Phone implements AndroidApp, Appleapp {


    public CyberPhone(String brand, String model, double price, double size) {
        super(brand, model, price, size);
    }

    @Override
    public void download() {
        System.out.println("downloading from "+AndroidApp.AppName   );
        System.out.println("downloading from "+Appleapp.AppName);
    }

    @Override
    public void texting(long phoneNumber) {

    }

    @Override
    public void calling(long phoneNumber) {

    }
}
