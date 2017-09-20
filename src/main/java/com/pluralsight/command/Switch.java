package com.pluralsight.command;

/**
 * Created by jingshanyin on 9/6/17.
 */
//invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
