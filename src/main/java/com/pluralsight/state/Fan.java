package com.pluralsight.state;

/**
 * Created by jingshanyin on 9/8/17.
 */
public class Fan {
    
    State fanOffState;
    State fanLowState;
    State fanMedState;
    State fanHighState;
    
    State state;
    
    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);
        
        state = fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public void pullChain() {
        state.handleRequest();
    }
    
    public String toString() {
        return state.toString();
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public State getFanOffState() {
        return fanOffState;
    }
}

/*
final static int OFF = 0;
    final static int LOW = 1;
    final static int MED = 2;

    int state = OFF;

    public Fan() {

    }

    public void pullChain() {
        if (state == OFF) {
            System.out.println("Turning fan on to low.");
            state = LOW;
        } else if (state == LOW) {
            System.out.println("Turning fan on to med..");
            state = MED;
        } else if (state == MED) {
            System.out.println("Turning fan off.");
            state = OFF;
        }
    }

    public String toString() {
        if (state == OFF) {
            return "Fan is off";
        } else if (state == LOW) {
            return "Fan is on low";
        } else if (state == MED) {
            return "Fan is on med";
        }

        return "Invalid state.";
    }
 */
