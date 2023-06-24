package org.firstinspires.ftc.teamcode.learn.lachlan.JavaForFTC.variables_datatypes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/*
You might be wondering why String is capitalized when all of the other data types we have seen so far aren’t.
This is because String is really a class.
By convention, class names start with a Capital letter and then every other word is also capitalized.
*/

@TeleOp
public class UseString extends OpMode{
    @Override
    public void init(){
        String myName = "Lachlan Paul";

        telemetry.addData("Hello, ", myName);
    }

    @Override
    public void loop(){

    }
}
