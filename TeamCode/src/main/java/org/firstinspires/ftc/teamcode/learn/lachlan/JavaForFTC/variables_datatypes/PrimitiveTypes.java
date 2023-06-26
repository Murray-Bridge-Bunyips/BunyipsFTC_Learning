package org.firstinspires.ftc.teamcode.learn.lachlan.JavaForFTC.variables_datatypes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/*
From the book I'm following:
There are 8 primitive data types in Java:
1. byte - from the range -128 to 127
2. char - for holding a single unicode character
3. short - a smaller integer (almost never used in FTC)
4. int - this is short for integer. It is for numbers with no decimal.
5. long - this is a larger integer. You can use it when you are concerned
about running out of room in an int.
6. float - this is for floating point numbers. It is smaller than a double so we
typically convert to a double.
7. double - this is for floating point numbers. It can hold numbers with
decimals.
8. boolean - this can be either true or false. (Yes, it contains one or the other
of these values.)
*/

@TeleOp()
public class PrimitiveTypes extends OpMode {

    @Override
    public void init(){
        int teamNumber = 15215;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = false;

        // This adds the data to the driver's station
        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);
    }

    @Override
    public void loop(){

    }
}
