package com.cybertek.eclipe.review_weeks.weak_17;

import java.util.Stack;

class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        //code that add item to shopping cart

        Stack<Item> allItems=new Stack<>();

        allItems.add(new Item("apple",2.5 ));
        allItems.add(new Item("orrage",3.2));
        allItems.add(new Item("mango",5));

        System.out.println(allItems.peek());



    }

}
