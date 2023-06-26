package org.firstinspires.ftc.teamcode.learn.lachlan.JavaForFTC.decisions;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Make a “crazy mode”. When gamepad1.a is pressed, report X as Y and Y as X.
// When it isn’t pressed, report the joystick as normal

// Whenever I learn about properly controlling the robot, I'll make an inverted control OpMode :)
@TeleOp()
public class CrazyOpMode extends OpMode {

    @Override
    public void init(){

    }

    @Override
    public void loop(){
        if (gamepad1.a){
            telemetry.addData("Left Stick Y: ", gamepad1.left_stick_x);
            telemetry.addData("Left Stick X: ", gamepad1.left_stick_y);
    }
        else {
            telemetry.addData("Left Stick Y: ", gamepad1.left_stick_y);
            telemetry.addData("Left Stick X: ", gamepad1.left_stick_x);
        }
    }
}
