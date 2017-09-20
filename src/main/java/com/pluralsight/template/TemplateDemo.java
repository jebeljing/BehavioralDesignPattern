package com.pluralsight.template;

/**
 * Created by jingshanyin on 9/9/17.
 */
public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("Web Order:");

        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("\nStore Order:");

        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
