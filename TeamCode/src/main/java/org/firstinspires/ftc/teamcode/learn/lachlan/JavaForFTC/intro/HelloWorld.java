package org.firstinspires.ftc.teamcode.learn.lachlan.JavaForFTC.intro;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class HelloWorld extends OpMode{

    // This runs whenever INIT is pressed on the driver station
    @Override
    public void init() {
        telemetry.addData("Hello", "World");
    }

    // When OpMode runs, this runs again and again and again and again and again and again and again and again and again and again, etc
    @Override
    public void loop() {
        // Empty :(
    }
}
