package com.pluralsight.strategy;

/**
 * Created by jingshanyin on 9/9/17.
 */
public class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;
        isValid = creditCard.getNumber().startsWith("4");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 16;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
