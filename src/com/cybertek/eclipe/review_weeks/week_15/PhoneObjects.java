package com.cybertek.eclipe.review_weeks.week_15;

public class PhoneObjects {
    public static void main(String[] args) {

        IPhone phone1=new IPhone("11",8.0, 2000);
        Phone phone2=new IPhone("8",7.5,1000);
        Object phone3=new IPhone("7",6.5,500);
        Appleapp phone4=new IPhone("5",5.5,1500);

        System.out.println(phone1.model);
        phone1.faceTime(32423424);

        //phone2.faceTime(34523455); this will give error. because referance is decide if thi method accessible.
        ((IPhone)phone2).faceTime(3434534);//this is down casting. so we can access the method

        //phone4.faceTime(34532542435);this is also need to cast
        ((IPhone)phone4).faceTime(345345636);

        phone4.download();
        phone1.calling(34345345);
        ((Phone)phone3).calling(465456434);
        ((IPhone)phone3).calling(465456434);
        ((IPhone) phone4).calling(456456);
        ((Phone) phone4).calling(4564564);






    }
}
