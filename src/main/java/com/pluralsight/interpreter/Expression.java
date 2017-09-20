package com.pluralsight.interpreter;

/**
 * Created by jingshanyin on 9/6/17.
 */
public interface Expression {

    boolean interpret(String context);
}
