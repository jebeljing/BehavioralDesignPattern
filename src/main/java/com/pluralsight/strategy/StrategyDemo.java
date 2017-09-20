package com.pluralsight.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by jingshanyin on 9/9/17.
 */
public class StrategyDemo {

    public static void main(String[] args) {

        Collections.sort(new ArrayList<CreditCard>(), new Comparator<CreditCard>() {
            @Override
            public int compare(CreditCard o1, CreditCard o2) {
                return 0;
            }
        });
        new Comparable<CreditCard>() {
            @Override
            public int compareTo(CreditCard o) {
                return 0;
            }
        };

        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());
        amexCard2.setNumber("379185883464282");
        amexCard2.setDate("04/2017");
        amexCard2.setCvv("234");

        System.out.println("Is Amex valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4539589763663402");
        visaCard.setDate("05/2018");
        visaCard.setCvv("324");

        System.out.println("Is Visa valid: " + visaCard.isValid());
    }
}
