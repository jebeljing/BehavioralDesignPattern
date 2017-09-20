package com.pluralsight.mediator;

/**
 * Created by jingshanyin on 9/7/17.
 */
public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);

        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCOmmand = new TurnOffAllLightsCommand(mediator);

        turnOffAllLightsCOmmand.execute();
    }
}
