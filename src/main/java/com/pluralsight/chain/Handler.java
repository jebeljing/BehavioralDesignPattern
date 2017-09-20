package com.pluralsight.chain;

/**
 * Created by jingshanyin on 9/5/17.
 */
abstract public class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
