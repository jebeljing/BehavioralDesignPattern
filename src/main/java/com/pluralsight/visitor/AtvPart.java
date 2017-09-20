package com.pluralsight.visitor;

/**
 * Created by jingshanyin on 9/9/17.
 */
public interface AtvPart {


    void accept(AtvPartVisitor visitor);
}
