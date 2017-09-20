package com.pluralsight.visitor;

/**
 * Created by jingshanyin on 9/9/17.
 */
public interface AtvPartVisitor {


    void visit(Oil oil);

    void visit(Fender fender);

    void visit(Wheel wheel);

    void visit(PartsOrder partsOrder);
}
