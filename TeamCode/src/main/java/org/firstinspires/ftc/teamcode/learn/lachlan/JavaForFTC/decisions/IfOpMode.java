package org.firstinspires.ftc.teamcode.learn.lachlan.JavaForFTC.decisions;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/*
Conditional Operators
Operator Meaning:
    == is equal to
    != is not equal to
    < is less than
    > is greater than
    <= is less than or equal to
    >= is greater than or equal to
*/

public class IfOpMode extends OpMode{

    @Override
    public void init(){

    }

    @Override
    public void loop(){
        if (gamepad1.left_stick_y > 0){
            telemetry.addData("Left stick", " is negative");
        }

        telemetry.addData("Left stick y", gamepad1.left_stick_y);
    }
}
