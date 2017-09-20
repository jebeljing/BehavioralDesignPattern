package com.pluralsight.visitor;

/**
 * Created by jingshanyin on 9/9/17.
 */
public class Wheel implements AtvPart {


    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
