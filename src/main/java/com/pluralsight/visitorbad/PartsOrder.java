package com.pluralsight.visitorbad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jingshanyin on 9/9/17.
 */
public class PartsOrder implements AtvPart {

    private List<AtvPart> parts = new ArrayList<>();

    public PartsOrder() {

    }

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    public double calculateShipping() {
        double shippingCost = 0;
        for (AtvPart atvPart: parts) {
            shippingCost += atvPart.calculateShipping();
        }
        return shippingCost;
    }
}
