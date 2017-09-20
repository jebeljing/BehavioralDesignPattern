package com.pluralsight.chain;

/**
 * Created by jingshanyin on 9/5/17.
 */
public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
